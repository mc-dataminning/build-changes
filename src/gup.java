import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gup extends gtu {
   private static final float a = 0.6666667F;
   private static final fgc b = new fgc(0.0, 0.33333334F, 0.046666667F);
   private final Map<ede, gup.a> c;

   public gup(gub.a $$0) {
      super($$0);
      this.c = ede.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gup.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected gij a(ebq $$0, ede $$1) {
      gup.a $$2 = this.c.get($$1);
      return $$0.b() instanceof dvt ? $$2.a() : $$2.b();
   }

   @Override
   protected hmx a(ede $$0) {
      return gsh.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(fld $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(fld $$0, float $$1, ebq $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof dvt)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected fgc c() {
      return b;
   }

   public static void a(fld $$0, grn $$1, int $$2, int $$3, gij $$4, hmx $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      flg $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gij a(gkn $$0, ede $$1, boolean $$2) {
      gkp $$3 = $$2 ? gkq.a($$1) : gkq.b($$1);
      return new gij.a($$0.a($$3), gry::g);
   }

   public static gkx a(boolean $$0) {
      gkz $$1 = new gkz();
      glb $$2 = $$1.a();
      $$2.a("sign", gkw.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gkt.a);
      if ($$0) {
         $$2.a("stick", gkw.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gkt.a);
      }

      return gkx.a($$1, 64, 32);
   }

   static record a(gij a, gij b) {
   }
}
