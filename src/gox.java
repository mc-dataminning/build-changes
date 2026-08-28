import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gox extends god {
   private static final float a = 0.6666667F;
   private static final faz b = new faz(0.0, 0.33333334F, 0.046666667F);
   private final Map<dyi, gox.a> c;

   public gox(gok.a $$0) {
      super($$0);
      this.c = dyi.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gox.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected gcv a(dww $$0, dyi $$1) {
      gox.a $$2 = this.c.get($$1);
      return $$0.b() instanceof drl ? $$2.a() : $$2.b();
   }

   @Override
   protected hgy a(dyi $$0) {
      return gms.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(fft $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(fft $$0, float $$1, dww $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof drl)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected faz c() {
      return b;
   }

   public static void a(fft $$0, glx $$1, int $$2, int $$3, gcv $$4, hgy $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      ffx $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static gcv a(gey $$0, dyi $$1, boolean $$2) {
      gfa $$3 = $$2 ? gfb.a($$1) : gfb.b($$1);
      return new gcv.a($$0.a($$3), gmh::g);
   }

   public static gfi a(boolean $$0) {
      gfk $$1 = new gfk();
      gfm $$2 = $$1.a();
      $$2.a("sign", gfh.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gfe.a);
      if ($$0) {
         $$2.a("stick", gfh.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gfe.a);
      }

      return gfi.a($$1, 64, 32);
   }

   static record a(gcv a, gcv b) {
   }
}
