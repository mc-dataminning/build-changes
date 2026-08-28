import javax.annotation.Nullable;

public class gky extends gke<ckk, fvu<ckk>> {
   private static final alf a = new alf("textures/" + gee.i.b().a() + ".png");
   private static final alf[] i = gee.j.stream().map($$0 -> new alf("textures/" + $$0.b().a() + ".png")).toArray(alf[]::new);

   public gky(giy.a $$0) {
      super($$0, new fvu<>($$0.a(fxa.bk)), 0.0F);
      this.a(new gnn(this));
   }

   public evs a(ckk $$0, float $$1) {
      return $$0.H($$1).orElse(super.a($$0, $$1)).a((double)$$0.ee());
   }

   public boolean a(ckk $$0, ggt $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.H(0.0F).filter($$2x -> {
         btb<?> $$3x = $$0.ak();
         float $$4x = $$3x.m() / 2.0F;
         float $$5 = $$3x.l() / 2.0F;
         evs $$6 = evs.c($$0.dp());
         return $$1.a(new evn($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public alf a(ckk $$0) {
      return a($$0.gr());
   }

   public static alf a(@Nullable ctj $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(ckk $$0, ezz $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4, $$5);
      $$1.a($$0.y().g().b(), 0.0F, 0.5F, 0.0F);
   }
}
