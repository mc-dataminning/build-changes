import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class goz extends gof {
   private static final float a = 0.6666667F;
   private static final fbb b = new fbb(0.0, 0.33333334F, 0.046666667F);
   private final Map<dyk, goz.a> c;

   public goz(gom.a $$0) {
      super($$0);
      this.c = dyk.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new goz.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected gcx a(dwy $$0, dyk $$1) {
      goz.a $$2 = this.c.get($$1);
      return $$0.b() instanceof drn ? $$2.a() : $$2.b();
   }

   @Override
   protected hha a(dyk $$0) {
      return gmu.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(ffv $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(ffv $$0, float $$1, dwy $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof drn)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected fbb c() {
      return b;
   }

   public static void a(ffv $$0, glz $$1, int $$2, int $$3, gcx $$4, hha $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      ffz $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gcx a(gfa $$0, dyk $$1, boolean $$2) {
      gfc $$3 = $$2 ? gfd.a($$1) : gfd.b($$1);
      return new gcx.a($$0.a($$3), gmj::g);
   }

   public static gfk a(boolean $$0) {
      gfm $$1 = new gfm();
      gfo $$2 = $$1.a();
      $$2.a("sign", gfj.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gfg.a);
      if ($$0) {
         $$2.a("stick", gfj.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gfg.a);
      }

      return gfk.a($$1, 64, 32);
   }

   static record a(gcx a, gcx b) {
   }
}
