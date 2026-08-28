import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gve extends guj {
   private static final float a = 0.6666667F;
   private static final ffs b = new ffs(0.0, 0.33333334F, 0.046666667F);
   private final Map<ecu, gve.a> c;

   public gve(guq.a $$0) {
      super($$0);
      this.c = ecu.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gve.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected giy a(ebg $$0, ecu $$1) {
      gve.a $$2 = this.c.get($$1);
      return $$0.b() instanceof dvj ? $$2.a() : $$2.b();
   }

   @Override
   protected hnj a(ecu $$0) {
      return gsw.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(flq $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(flq $$0, float $$1, ebg $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof dvj)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected ffs c() {
      return b;
   }

   public static void a(flq $$0, gsc $$1, int $$2, int $$3, giy $$4, hnj $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      flt $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static giy a(glc $$0, ecu $$1, boolean $$2) {
      gle $$3 = $$2 ? glf.a($$1) : glf.b($$1);
      return new giy.a($$0.a($$3), gsn::g);
   }

   public static glm a(boolean $$0) {
      glo $$1 = new glo();
      glq $$2 = $$1.a();
      $$2.a("sign", gll.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gli.a);
      if ($$0) {
         $$2.a("stick", gll.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gli.a);
      }

      return glm.a($$1, 64, 32);
   }

   static record a(giy a, giy b) {
   }
}
