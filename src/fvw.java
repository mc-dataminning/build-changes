import org.joml.Quaternionf;

public class fvw extends fwb<bzl> {
   private static final agm a = new agm("textures/entity/end_crystal/end_crystal.png");
   private static final frh f = frh.e(a);
   private static final float g = (float)Math.sin(Math.PI / 4);
   private static final String h = "glass";
   private static final String i = "base";
   private final fkt j;
   private final fkt k;
   private final fkt l;

   public fvw(fwc.a $$0) {
      super($$0);
      this.d = 0.5F;
      fkt $$1 = $$0.a(fks.U);
      this.k = $$1.b("glass");
      this.j = $$1.b("cube");
      this.l = $$1.b("base");
   }

   public static fkz a() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      $$1.a("glass", fky.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fkv.a);
      $$1.a("cube", fky.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fkv.a);
      $$1.a("base", fky.c().a(0, 16).a(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F), fkv.a);
      return fkz.a($$0, 64, 32);
   }

   public void a(bzl $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5) {
      $$3.a();
      float $$6 = a($$0, $$2);
      float $$7 = ((float)$$0.b + $$2) * 3.0F;
      eof $$8 = $$4.getBuffer(f);
      $$3.a();
      $$3.b(2.0F, 2.0F, 2.0F);
      $$3.a(0.0F, -0.5F, 0.0F);
      int $$9 = gbq.d;
      if ($$0.s()) {
         this.l.a($$3, $$8, $$5, $$9);
      }

      $$3.a(a.d.rotationDegrees($$7));
      $$3.a(0.0F, 1.5F + $$6 / 2.0F, 0.0F);
      $$3.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), g, 0.0F, g));
      this.k.a($$3, $$8, $$5, $$9);
      float $$10 = 0.875F;
      $$3.b(0.875F, 0.875F, 0.875F);
      $$3.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), g, 0.0F, g));
      $$3.a(a.d.rotationDegrees($$7));
      this.k.a($$3, $$8, $$5, $$9);
      $$3.b(0.875F, 0.875F, 0.875F);
      $$3.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), g, 0.0F, g));
      $$3.a(a.d.rotationDegrees($$7));
      this.j.a($$3, $$8, $$5, $$9);
      $$3.b();
      $$3.b();
      hx $$11 = $$0.q();
      if ($$11 != null) {
         float $$12 = (float)$$11.u() + 0.5F;
         float $$13 = (float)$$11.v() + 0.5F;
         float $$14 = (float)$$11.w() + 0.5F;
         float $$15 = (float)((double)$$12 - $$0.ds());
         float $$16 = (float)((double)$$13 - $$0.du());
         float $$17 = (float)((double)$$14 - $$0.dy());
         $$3.a($$15, $$16, $$17);
         fvx.a(-$$15, -$$16 + $$6, -$$17, $$2, $$0.b, $$3, $$4, $$5);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static float a(bzl $$0, float $$1) {
      float $$2 = (float)$$0.b + $$1;
      float $$3 = atq.a($$2 * 0.2F) / 2.0F + 0.5F;
      $$3 = ($$3 * $$3 + $$3) * 0.4F;
      return $$3 - 1.4F;
   }

   public agm a(bzl $$0) {
      return a;
   }

   public boolean a(bzl $$0, fub $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.q() != null;
   }
}
