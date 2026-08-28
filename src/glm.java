import javax.annotation.Nullable;

public class glm extends gks<cjw, fwh<cjw>> {
   private static final akk a = new akk("textures/" + ges.i.b().a() + ".png");
   private static final akk[] i = ges.j.stream().map($$0 -> new akk("textures/" + $$0.b().a() + ".png")).toArray(akk[]::new);

   public glm(gjm.a $$0) {
      super($$0, new fwh<>($$0.a(fxn.bk)), 0.0F);
      this.a(new gob(this));
   }

   public ewf a(cjw $$0, float $$1) {
      return $$0.I($$1).orElse(super.a($$0, $$1)).a((double)$$0.ec());
   }

   public boolean a(cjw $$0, ghh $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) ? true : $$0.I(0.0F).filter($$2x -> {
         bsm<?> $$3x = $$0.al();
         float $$4x = $$3x.m() / 2.0F;
         float $$5 = $$3x.l() / 2.0F;
         ewf $$6 = ewf.c($$0.dq());
         return $$1.a(new ewa($$2x.c, $$2x.d + (double)$$4x, $$2x.e, $$6.c, $$6.d + (double)$$4x, $$6.e).c((double)$$5, (double)$$4x, (double)$$5));
      }).isPresent();
   }

   public akk a(cjw $$0) {
      return a($$0.gp());
   }

   public static akk a(@Nullable csv $$0) {
      return $$0 == null ? a : i[$$0.a()];
   }

   protected void a(cjw $$0, fam $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3 + 180.0F, $$4, $$5);
      $$1.a($$0.y().g().b(), 0.0F, 0.5F, 0.0F);
   }
}
