import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gpx extends gpd {
   private static final float a = 0.6666667F;
   private static final fbx b = new fbx(0.0, 0.33333334F, 0.046666667F);
   private final Map<dzd, gpx.a> c;

   public gpx(gpk.a $$0) {
      super($$0);
      this.c = dzd.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gpx.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected gdv a(dxq $$0, dzd $$1) {
      gpx.a $$2 = this.c.get($$1);
      return $$0.b() instanceof dsf ? $$2.a() : $$2.b();
   }

   @Override
   protected hhy a(dzd $$0) {
      return gns.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(fgr $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(fgr $$0, float $$1, dxq $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof dsf)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected fbx c() {
      return b;
   }

   public static void a(fgr $$0, gmx $$1, int $$2, int $$3, gdv $$4, hhy $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      fgv $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gdv a(gfy $$0, dzd $$1, boolean $$2) {
      gga $$3 = $$2 ? ggb.a($$1) : ggb.b($$1);
      return new gdv.a($$0.a($$3), gnh::g);
   }

   public static ggi a(boolean $$0) {
      ggk $$1 = new ggk();
      ggm $$2 = $$1.a();
      $$2.a("sign", ggh.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gge.a);
      if ($$0) {
         $$2.a("stick", ggh.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gge.a);
      }

      return ggi.a($$1, 64, 32);
   }

   static record a(gdv a, gdv b) {
   }
}
