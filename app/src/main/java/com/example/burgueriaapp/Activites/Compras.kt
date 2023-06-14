package com.example.burgueriaapp.Activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import com.example.burgueriaapp.R
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class Compras : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compras)

        val database = FirebaseDatabase.getInstance()
        val getAlface = database.getReference("user/0/produtos/produtosCozinha/1/em_falta")
        val getTomate = database.getReference("user/0/produtos/produtosCozinha/2/em_falta")
        val getMaionese = database.getReference("user/0/produtos/produtosCozinha/3/em_falta")
        val getRucula = database.getReference("user/0/produtos/produtosCozinha/4/em_falta")
        val getCebola = database.getReference("user/0/produtos/produtosCozinha/5/em_falta")
        val getCRoxa = database.getReference("user/0/produtos/produtosCozinha/6/em_falta")
        val getAbacate = database.getReference("user/0/produtos/produtosCozinha/7/em_falta")
        val getMaracuja = database.getReference("user/0/produtos/produtosCozinha/8/em_falta")
        val getSal = database.getReference("user/0/produtos/produtosCozinha/9/em_falta")
        val getCarne = database.getReference("user/0/produtos/produtosCozinha/10/em_falta")
        val getBacon = database.getReference("user/0/produtos/produtosCozinha/11/em_falta")
        val getCheddar = database.getReference("user/0/produtos/produtosCozinha/12/em_falta")
        val getCoalho = database.getReference("user/0/produtos/produtosCozinha/13/em_falta")
        val getGoiabada = database.getReference("user/0/produtos/produtosCozinha/14/em_falta")
        val getChimichurri = database.getReference("user/0/produtos/produtosCozinha/15/em_falta")
        val getPaprica = database.getReference("user/0/produtos/produtosCozinha/16/em_falta")
        val getJalapeno = database.getReference("user/0/produtos/produtosCozinha/17/em_falta")
        val getLuva = database.getReference("user/0/produtos/produtosCozinha/18/em_falta")
        val getTouca = database.getReference("user/0/produtos/produtosCozinha/19/em_falta")
        val getAcoplado = database.getReference("user/0/produtos/produtosCozinha/20/em_falta")
        val getKraft = database.getReference("user/0/produtos/produtosCozinha/21/em_falta")
        val getFrango = database.getReference("user/0/produtos/produtosCozinha/22/em_falta")
        val getOnion = database.getReference("user/0/produtos/produtosCozinha/23/em_falta")
        val getQueijin = database.getReference("user/0/produtos/produtosCozinha/24/em_falta")
        val getCoxinha = database.getReference("user/0/produtos/produtosCozinha/25/em_falta")
        val getBolinho = database.getReference("user/0/produtos/produtosCozinha/26/em_falta")
        val getPastel = database.getReference("user/0/produtos/produtosCozinha/27/em_falta")
        val getBatata = database.getReference("user/0/produtos/produtosCozinha/28/em_falta")
        val getEspetinho = database.getReference("user/0/produtos/produtosCozinha/29em_falta")
        val getMIngles = database.getReference("user/0/produtos/produtosCozinha/30/em_falta")
        val getPToalha = database.getReference("user/0/produtos/produtosCozinha/31/em_falta")
        val getOleo = database.getReference("user/0/produtos/produtosCozinha/32/em_falta")
        val getSaquinho = database.getReference("user/0/produtos/produtosCozinha/32/em_falta")
        val getSaquinho = database.getReference("user/0/produtos/produtosCozinha/32/em_falta")
        val getSaquinho = database.getReference("user/0/produtos/produtosCozinha/32/em_falta")




        val getcoca = database.getReference("user/0/produtos/produtosBar/1/em_falta")
        val getcocaZero = database.getReference("user/0/produtos/produtosBar/2/em_falta")
        val getGuarana = database.getReference("user/0/produtos/produtosBar/3/em_falta")
        val getGuaranaZero = database.getReference("user/0/produtos/produtosBar/4/em_falta")
        val getFantaUva = database.getReference("user/0/produtos/produtosBar/5/em_falta")
        val getFantaLaranja = database.getReference("user/0/produtos/produtosBar/6/em_falta")
        val getSprite = database.getReference("user/0/produtos/produtosBar/7/em_falta")
        val getAguaTonica = database.getReference("user/0/produtos/produtosBar/8/em_falta")
        val getAgua = database.getReference("user/0/produtos/produtosBar/9/em_falta")
        val getAguaGas = database.getReference("user/0/produtos/produtosBar/10/em_falta")
        val getSuco = database.getReference("user/0/produtos/produtosBar/11/em_falta")
        val getGuardanapo = database.getReference("user/0/produtos/produtosBar/12/em_falta")
        val getKetchup = database.getReference("user/0/produtos/produtosBar/13/em_falta")
        val getMostarda = database.getReference("user/0/produtos/produtosBar/14/em_falta")
        val getCanudo = database.getReference("user/0/produtos/produtosBar/15/em_falta")
        val getOriginal = database.getReference("user/0/produtos/produtosBar/16/em_falta")
        val getLitrao = database.getReference("user/0/produtos/produtosBar/17/em_falta")
        val getSpaten = database.getReference("user/0/produtos/produtosBar/18/em_falta")
        val getStella = database.getReference("user/0/produtos/produtosBar/19/em_falta")
        val getHeineken = database.getReference("user/0/produtos/produtosBar/20/em_falta")
        val getBecks = database.getReference("user/0/produtos/produtosBar/21/em_falta")
        val getLimao = database.getReference("user/0/produtos/produtosBar/22/em_falta")
        val getGelo = database.getReference("user/0/produtos/produtosBar/23/em_falta")
        val getAcucar = database.getReference("user/0/produtos/produtosBar/24/em_falta")
        val getSal2 = database.getReference("user/0/produtos/produtosBar/25/em_falta")
        val getCopo = database.getReference("user/0/produtos/produtosBar/26/em_falta")
        val getPTaca = database.getReference("user/0/produtos/produtosBar/27/em_falta")
        val getCachaca = database.getReference("user/0/produtos/produtosBar/28/em_falta")
        val getVodka = database.getReference("user/0/produtos/produtosBar/29/em_falta")
        val getRedBull = database.getReference("user/0/produtos/produtosBar/30/em_falta")
        val getGin = database.getReference("user/0/produtos/produtosBar/31/em_falta")
        val getWhiskey = database.getReference("user/0/produtos/produtosBar/32/em_falta")


        val getSacoGrande = database.getReference("user/0/produtos/produtosLimpeza/1/em_falta")
        val getSacolaRefri = database.getReference("user/0/produtos/produtosLimpeza/2/em_falta")
        val getDesinfetante = database.getReference("user/0/produtos/produtosLimpeza/3/em_falta")
        val getPapelHig = database.getReference("user/0/produtos/produtosLimpeza/4/em_falta")
        val getDetergente = database.getReference("user/0/produtos/produtosLimpeza/5/em_falta")
        val getAguaSanit = database.getReference("user/0/produtos/produtosLimpeza/6/em_falta")
        val getSabonete = database.getReference("user/0/produtos/produtosLimpeza/7/em_falta")
        val getFlanela = database.getReference("user/0/produtos/produtosLimpeza/8/em_falta")
        val getProdMesa = database.getReference("user/0/produtos/produtosLimpeza/9/em_falta")
        val getRodo = database.getReference("user/0/produtos/produtosLimpeza/10/em_falta")
        val getVassoura = database.getReference("user/0/produtos/produtosLimpeza/11/em_falta")
        val getBalde = database.getReference("user/0/produtos/produtosLimpeza/12/em_falta")






        val checkBoxAlface = findViewById<CheckBox>(R.id.alface)
        val checkBoxTomate = findViewById<CheckBox>(R.id.tomate)
        val checkBoxMaionese = findViewById<CheckBox>(R.id.maionese)
        val checkBoxRucula = findViewById<CheckBox>(R.id.rucula4)
        val checkBoxCebola = findViewById<CheckBox>(R.id.cebola5)
        val checkBoxCRoxa = findViewById<CheckBox>(R.id.cebolaRoxa6)
        val checkBoxAbacate = findViewById<CheckBox>(R.id.abacate7)
        val checkBoxMaracuja = findViewById<CheckBox>(R.id.maracuja8)
        val checkBoxSal = findViewById<CheckBox>(R.id.sal9)
        val checkBoxCarne = findViewById<CheckBox>(R.id.carne10)
        val checkBoxBacon = findViewById<CheckBox>(R.id.bacon11)
        val checkBoxCheddar = findViewById<CheckBox>(R.id.cheddar12)
        val checkBoxCoalho = findViewById<CheckBox>(R.id.coalho13)
        val checkBoxGoiabada = findViewById<CheckBox>(R.id.goiabada14)
        val checkBoxChimichurri = findViewById<CheckBox>(R.id.chimichurri15)
        val checkBoxPaprica = findViewById<CheckBox>(R.id.paprica16)
        val checkBoxJalapeno = findViewById<CheckBox>(R.id.jalapeno17)
        val checkBoxLuva = findViewById<CheckBox>(R.id.luva18)
        val checkBoxTouca = findViewById<CheckBox>(R.id.touca19)
        val checkBoxAcoplado = findViewById<CheckBox>(R.id.acoplado20)
        val checkBoxKraft = findViewById<CheckBox>(R.id.kraft21)
        val checkBoxFrango = findViewById<CheckBox>(R.id.frango22)
        val checkBoxOnion = findViewById<CheckBox>(R.id.onion23)
        val checkBoxQueijin = findViewById<CheckBox>(R.id.queijin24)
        val checkBoxCoxinha = findViewById<CheckBox>(R.id.coxinha25)
        val checkBoxBolinho = findViewById<CheckBox>(R.id.bolinho26)
        val checkBoxPastel = findViewById<CheckBox>(R.id.pastel27)
        val checkBoxBatata = findViewById<CheckBox>(R.id.batata28)
        val checkBoxEspetinho = findViewById<CheckBox>(R.id.espetinho29)
        val checkBoxMIngles = findViewById<CheckBox>(R.id.ingles30)
        val checkBoxPToalha = findViewById<CheckBox>(R.id.pToalha31)
        val checkBoxOleo = findViewById<CheckBox>(R.id.oleo32)



        val checkBoxCoca = findViewById<CheckBox>(R.id.coca)
        val checkBoxCocaZero = findViewById<CheckBox>(R.id.cocaZero)
        val checkBoxGuarana = findViewById<CheckBox>(R.id.guarana)
        val checkBoxGuaranaZero = findViewById<CheckBox>(R.id.guaranaZero4)
        val checkBoxFantaUva = findViewById<CheckBox>(R.id.fantaUva5)
        val checkBoxFantaLaranja = findViewById<CheckBox>(R.id.fantaLaranja6)
        val checkBoxSprite = findViewById<CheckBox>(R.id.sprite7)
        val checkBoxAguaTonica = findViewById<CheckBox>(R.id.tonica8)
        val checkBoxAgua = findViewById<CheckBox>(R.id.agua9)
        val checkBoxAguaGas = findViewById<CheckBox>(R.id.aguaGas10)
        val checkBoxSuco = findViewById<CheckBox>(R.id.suco11)
        val checkBoxGuardanapo = findViewById<CheckBox>(R.id.guardanapo12)
        val checkBoxKetchup = findViewById<CheckBox>(R.id.ketchup13)
        val checkBoxMostarda = findViewById<CheckBox>(R.id.mostarda14)
        val checkBoxCanudo = findViewById<CheckBox>(R.id.canudo15)
        val checkBoxOriginal = findViewById<CheckBox>(R.id.original16)
        val checkBoxLitrao = findViewById<CheckBox>(R.id.litrao17)
        val checkBoxSpaten = findViewById<CheckBox>(R.id.spaten18)
        val checkBoxStella = findViewById<CheckBox>(R.id.stella19)
        val checkBoxHeineken = findViewById<CheckBox>(R.id.heineken20)
        val checkBoxBecks = findViewById<CheckBox>(R.id.becks21)
        val checkBoxLimao = findViewById<CheckBox>(R.id.limao22)
        val checkBoxGelo = findViewById<CheckBox>(R.id.gelo23)
        val checkBoxAcucar = findViewById<CheckBox>(R.id.acucar24)
        val checkBoxSal2 = findViewById<CheckBox>(R.id.sal25)
        val checkBoxCopo = findViewById<CheckBox>(R.id.copo26)
        val checkBoxPTaca = findViewById<CheckBox>(R.id.taca27)
        val checkBoxCachaca = findViewById<CheckBox>(R.id.cachaca28)
        val checkBoxVodka = findViewById<CheckBox>(R.id.vodka29)
        val checkBoxRedBull = findViewById<CheckBox>(R.id.redBull30)
        val checkBoxGin = findViewById<CheckBox>(R.id.gin31)
        val checkBoxWhiskey = findViewById<CheckBox>(R.id.whiskey32)


        val checkBoxSaco = findViewById<CheckBox>(R.id.sacoGrande1)
        val checkBoxSacola =  findViewById<CheckBox>(R.id.sacolaRef2)
        val checkBoxDesinfetante = findViewById<CheckBox>(R.id.desinfetante3)
        val checkBoxPapel = findViewById<CheckBox>(R.id.papelHig4)
        val checkBoxDetergente = findViewById<CheckBox>(R.id.detergente5)
        val checkBoxAguaSanit = findViewById<CheckBox>(R.id.aguasanit6)
        val checkBoxSabonete = findViewById<CheckBox>(R.id.sabonete7)
        val checkBoxFlanela = findViewById<CheckBox>(R.id.flanela8)
        val checkBoxProdMesa = findViewById<CheckBox>(R.id.produtoMesa9)
        val checkBoxRodo =findViewById<CheckBox>(R.id.rodo10)
        val checkBoxVassoura = findViewById<CheckBox>(R.id.vassoura11)
        val checkBoxBalde = findViewById<CheckBox>(R.id.balde12)



        val mapCozinha = mapOf(
            getAlface to checkBoxAlface,
            getTomate to checkBoxTomate,
            getMaionese to checkBoxMaionese,
            getRucula to checkBoxRucula,
            getCebola to checkBoxCebola,
            getCRoxa to checkBoxCRoxa,
            getAbacate to checkBoxAbacate,
            getMaracuja to checkBoxMaracuja,
            getSal to checkBoxSal,
            getCarne to checkBoxCarne,
            getBacon to checkBoxBacon,
            getCheddar to checkBoxCheddar,
            getCoalho to checkBoxCoalho,
            getGoiabada to checkBoxGoiabada,
            getChimichurri to checkBoxChimichurri,
            getPaprica to checkBoxPaprica,
            getJalapeno to checkBoxJalapeno,
            getLuva to checkBoxLuva,
            getTouca to checkBoxTouca,
            getAcoplado to checkBoxAcoplado,
            getKraft to checkBoxKraft,
            getFrango to checkBoxFrango,
            getOnion to checkBoxOnion,
            getQueijin to checkBoxQueijin,
            getCoxinha to checkBoxCoxinha,
            getBolinho to checkBoxBolinho,
            getPastel to checkBoxPastel,
            getBatata to checkBoxBatata,
            getEspetinho to checkBoxEspetinho,
            getMIngles to checkBoxMIngles,
            getPToalha to checkBoxPToalha,
            getOleo to checkBoxOleo
        )


        val mapBar = mapOf(
            getcoca to checkBoxCoca,
            getcocaZero to checkBoxCocaZero,
            getGuarana to checkBoxGuarana,
            getGuaranaZero to checkBoxGuaranaZero,
            getFantaUva to checkBoxFantaUva,
            getFantaLaranja to checkBoxFantaLaranja,
            getSprite to checkBoxSprite,
            getAguaTonica to checkBoxAguaTonica,
            getAgua to checkBoxAgua,
            getAguaGas to checkBoxAguaGas,
            getSuco to checkBoxSuco,
            getGuardanapo to checkBoxGuardanapo,
            getKetchup to checkBoxKetchup,
            getMostarda to checkBoxMostarda,
            getCanudo to checkBoxCanudo,
            getOriginal to checkBoxOriginal,
            getLitrao to checkBoxLitrao,
            getSpaten to checkBoxSpaten,
            getStella to checkBoxStella,
            getHeineken to checkBoxHeineken,
            getBecks to checkBoxBecks,
            getLimao to checkBoxLimao,
            getGelo to checkBoxGelo,
            getAcucar to checkBoxAcucar,
            getSal2 to checkBoxSal2,
            getCopo to checkBoxCopo,
            getPTaca to checkBoxPTaca,
            getCachaca to checkBoxCachaca,
            getVodka to checkBoxVodka,
            getRedBull to checkBoxRedBull,
            getGin to checkBoxGin,
            getWhiskey to checkBoxWhiskey
        )


        val mapLimpeza = mapOf(
            getSacoGrande to checkBoxSaco,
            getSacolaRefri to checkBoxSacola,
            getDesinfetante to checkBoxDesinfetante,
            getPapelHig to checkBoxPapel,
            getDetergente to checkBoxDetergente,
            getAguaSanit to checkBoxAguaSanit,
            getSabonete to checkBoxSabonete,
            getFlanela to checkBoxFlanela,
            getProdMesa to checkBoxProdMesa,
            getRodo to checkBoxRodo,
            getVassoura to checkBoxVassoura,
            getBalde to checkBoxBalde
        )



        fun pegarFirebase(checkBox: CheckBox, databaseReference: DatabaseReference) {
            checkBox.setOnClickListener {
                val isChecked = checkBox.isChecked
                databaseReference.setValue(isChecked)
                    .addOnSuccessListener {
                        Toast.makeText(
                            applicationContext,
                            "Valor atualizado com sucesso!",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                    .addOnFailureListener { error ->
                        Toast.makeText(
                            applicationContext,
                            "Erro ao atualizar o valor: ${error.message}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
            }

            databaseReference.addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    // Verifica se o dado existe
                    if (dataSnapshot.exists()) {
                        // Obtém o valor do DataSnapshot
                        val isChecked = dataSnapshot.getValue(Boolean::class.java)
                        checkBox.isChecked = isChecked ?: false
                   }
                    //                    else {
//                        Toast.makeText(applicationContext, "O dado não existe", Toast.LENGTH_SHORT)
//                            .show()
//                    }
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    // Lidar com erros de leitura do Firebase
                    Toast.makeText(
                        applicationContext,
                        "Erro ao ler dados: ${databaseError.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            })
        }
        for ((getRef, checkBox) in mapCozinha) {
            pegarFirebase(checkBox, getRef)
        }
        for ((getRef, checkBox) in mapBar) {
            pegarFirebase(checkBox, getRef)
        }
        for ((getRef, checkBox) in mapLimpeza) {
            pegarFirebase(checkBox, getRef)
        }
    }
}