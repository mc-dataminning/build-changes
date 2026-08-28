import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gtb extends gsg {
   private static final float a = 0.6666667F;
   private static final feq b = new feq(0.0, 0.33333334F, 0.046666667F);
   private final Map<ebv, gtb.a> c;

   public gtb(gsn.a $$0) {
      super($$0);
      this.c = ebv.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new gtb.a(a($$0.f(), $$1, true), a($$0.f(), $$1, false))));
   }

   @Override
   protected ggu a(eah $$0, ebv $$1) {
      gtb.a $$2 = this.c.get($$1);
      return $$0.b() instanceof duk ? $$2.a() : $$2.b();
   }

   @Override
   protected hle a(ebv $$0) {
      return gqv.a($$0);
   }

   @Override
   protected float a() {
      return 0.6666667F;
   }

   @Override
   protected float b() {
      return 0.6666667F;
   }

   private static void a(fjj $$0, float $$1) {
      $$0.a(0.5F, 0.5F, 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
   }

   @Override
   protected void a(fjj $$0, float $$1, eah $$2) {
      a($$0, $$1);
      if (!($$2.b() instanceof duk)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   @Override
   protected feq c() {
      return b;
   }

   public static void a(fjj $$0, gqa $$1, int $$2, int $$3, ggu $$4, hle $$5) {
      $$0.a();
      a($$0, 0.0F);
      $$0.b(0.6666667F, -0.6666667F, -0.6666667F);
      fjn $$6 = $$5.a($$1, $$4::a);
      $$4.a($$0, $$6, $$2, $$3);
      $$0.b();
   }

   public static ggu a(giy $$0, ebv $$1, boolean $$2) {
      gja $$3 = $$2 ? gjb.a($$1) : gjb.b($$1);
      return new ggu.a($$0.a($$3), gqk::g);
   }

   public static gji a(boolean $$0) {
      gjk $$1 = new gjk();
      gjm $$2 = $$1.a();
      $$2.a("sign", gjh.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), gje.a);
      if ($$0) {
         $$2.a("stick", gjh.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), gje.a);
      }

      return gji.a($$1, 64, 32);
   }

   static record a(ggu a, ggu b) {
   }
}
