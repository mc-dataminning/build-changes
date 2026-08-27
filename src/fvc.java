import javax.annotation.Nullable;

public class fvc extends fuj<bzu, fgr<bzu>> {
   private static final aez a = new aez("textures/" + foo.i.b().a() + ".png");
   private static final aez[] i = foo.j.stream().map($$0 -> new aez("textures/" + $$0.b().a() + ".png")).toArray(aez[]::new);

   public fvc(ftd.a $$0) {
      super($$0, new fgr<>($$0.a(fhw.be)), 0.0F);
      this.a(new fxo(this));
   }

   public ehh a(bzu $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(bzu $$0, frc $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         bja<?> $$3x = $$0.ag();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         ehh $$6 = ehh.c($$0.dl());
         return $$1.a(new ehc($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public aez a(bzu $$0) {
      return a($$0.gf());
   }

   public static aez a(@Nullable chz $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(bzu $$0, elj $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.y().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
