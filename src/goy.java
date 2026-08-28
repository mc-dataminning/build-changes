import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class goy extends goe {
   private static final float a = 0.6666667F;
   private static final fba b = new fba(0.0, 0.33333334F, 0.046666667F);
   private final Map<dyj, goy.a> c;

   public goy(gol.a $$0) {
      super($$0);
      this.c = dyj.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new goy.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected gcw a(dwx $$0, dyj $$1) {
      goy.a $$2 = this.c.get($$1);
      return $$0.b() instanceof drm ? $$2.a() : $$2.b();
   }

   @Override
   protected hgz a(dyj $$0) {
      return gmt.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(ffu $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(ffu $$0, float $$1, dwx $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof drm)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected fba c() {
      return b;
   }

   public static void a(ffu $$0, gly $$1, int $$2, int $$3, gcw $$4, hgz $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      ffy $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gcw a(gez $$0, dyj $$1, boolean $$2) {
      gfb $$3 = $$2 ? gfc.a($$1) : gfc.b($$1);
      return new gcw.a($$0.a($$3), gmi::g);
   }

   public static gfj a(boolean $$0) {
      gfl $$1 = new gfl();
      gfn $$2 = $$1.a();
      $$2.a("sign", gfi.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gff.a);
      if ($$0) {
         $$2.a("stick", gfi.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gff.a);
      }

      return gfj.a($$1, 64, 32);
   }

   static record a(gcw a, gcw b) {
   }
}
