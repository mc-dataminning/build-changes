import java.util.Map;

public class gkr extends gkc<cdl, ftm<cdl>> {
   private final ftm<cdl> a;
   private static final Map<bpy.a, ajv> b = Map.of(
      bpy.a.b,
      new ajv("textures/entity/wolf/wolf_armor_crackiness_low.png"),
      bpy.a.c,
      new ajv("textures/entity/wolf/wolf_armor_crackiness_medium.png"),
      bpy.a.d,
      new ajv("textures/entity/wolf/wolf_armor_crackiness_high.png")
   );

   public gkr(ghm<cdl, ftm<cdl>> $$0, ftr $$1) {
      super($$0);
      this.a = new ftm<>($$1.a(ftu.cd));
   }

   public void a(ewr $$0, gai $$1, int $$2, cdl $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.gz()) {
         crs $$10 = $$3.fP();
         if ($$10.f() instanceof cpg $$11) {
            this.c().a(this.a);
            this.a.a($$3, $$4, $$5, $$6);
            this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
            ewv var14 = $$1.getBuffer(gaq.e($$11.b()));
            this.a.a($$0, var14, $$2, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
            this.a($$0, $$1, $$2, $$10, $$11);
            this.a($$0, $$1, $$2, $$10);
         }
      }
   }

   private void a(ewr $$0, gai $$1, int $$2, crs $$3, cpg $$4) {
      if ($$3.a(avm.ba)) {
         int $$5 = cuf.a($$3, 0);
         if (aww.b.a($$5) == 0) {
            return;
         }

         ajv $$6 = $$4.c();
         if ($$6 == null) {
            return;
         }

         float $$7 = (float)aww.b.b($$5) / 255.0F;
         float $$8 = (float)aww.b.c($$5) / 255.0F;
         float $$9 = (float)aww.b.d($$5) / 255.0F;
         this.a.a($$0, $$1.getBuffer(gaq.e($$6)), $$2, glj.d, $$7, $$8, $$9, 1.0F);
      }
   }

   private void a(ewr $$0, gai $$1, int $$2, crs $$3) {
      bpy.a $$4 = bpy.b.a($$3);
      if ($$4 != bpy.a.a) {
         ajv $$5 = b.get($$4);
         ewv $$6 = $$1.getBuffer(gaq.i($$5));
         this.a.a($$0, $$6, $$2, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
