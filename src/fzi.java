import java.util.List;

public class fzi extends fzd<cvi> {
   private static final alg G = alg.b("container/blast_furnace/lit_progress");
   private static final alg H = alg.b("container/blast_furnace/burn_progress");
   private static final alg I = alg.b("textures/gui/container/blast_furnace.png");
   private static final wy J = wy.c("gui.recipebook.toggleRecipes.blastable");
   private static final List<gcm.a> K = List.of(new gcm.a(gcs.c), new gcm.a(czo.au, ded.h), new gcm.a(czo.pQ, czo.qE, ded.i));

   public fzi(cvi $$0, cri $$1, wy $$2) {
      super($$0, $$1, $$2, J, I, G, H, K);
   }
}
