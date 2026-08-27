import javax.annotation.Nullable;

public class fvi extends fup<bzq, fgy<bzq>> {
   private static final aey a = new aey("textures/" + fov.i.b().a() + ".png");
   private static final aey[] i = fov.j.stream().map($$0 -> new aey("textures/" + $$0.b().a() + ".png")).toArray(aey[]::new);

   public fvi(ftj.a $$0) {
      super($$0, new fgy<>($$0.a(fid.be)), 0.0F);
      this.a(new fxu(this));
   }

   public ehp a(bzq $$0, float $$1) {
      return $$0.F($$1).orElse(super.a($$0, $$1));
   }

   public boolean a(bzq $$0, fri $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.F(0.0F).filter($$2x -> {
         biw<?> $$3x = $$0.ag();
         float $$4x = $$3x.l() / 2.0F;
         float $$5 = $$3x.k() / 2.0F;
         ehp $$6 = ehp.c($$0.dl());
         return $$1.a(new ehk($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public aey a(bzq $$0) {
      return a($$0.ge());
   }

   public static aey a(@Nullable chv $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(bzq $$0, elr $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4);
      $$1.a(0.0, 0.5, 0.0);
      $$1.a($$0.y().g().b());
      $$1.a(0.0, -0.5, 0.0);
   }
}
