import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fwd extends fwh {
   private static final String a = "plank";
   private static final String b = "vChains";
   private static final String c = "normalChains";
   private static final String d = "chainL1";
   private static final String e = "chainL2";
   private static final String f = "chainR1";
   private static final String g = "chainR2";
   private static final String h = "board";
   private static final float i = 1.0F;
   private static final float j = 0.9F;
   private static final emc k = new emc(0.0, -0.32F, 0.073F);
   private final Map<dlc, fwd.a> l;

   public fwd(fvu.a $$0) {
      super($$0);
      this.l = dlc.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fwd.a($$0.a(fni.b($$1)))));
   }

   @Override
   public float b() {
      return 1.0F;
   }

   @Override
   public float c() {
      return 0.9F;
   }

   @Override
   public void a(dim $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      djp $$6 = $$0.r();
      ddx $$7 = (ddx)$$6.b();
      dlc $$8 = ddx.a($$7);
      fwd.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(eqk $$0, float $$1, djp $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(eqk $$0, int $$1, int $$2, flf $$3, eqo $$4) {
      fwd.a $$5 = (fwd.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   ghe a(dlc $$0) {
      return fui.b($$0);
   }

   @Override
   emc d() {
      return k;
   }

   public static fnp e() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("board", fno.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fnl.a);
      $$1.a("plank", fno.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fnl.a);
      fns $$2 = $$1.a("normalChains", fno.c(), fnl.a);
      $$2.a("chainL1", fno.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fnl.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fno.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fnl.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fno.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fnl.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fno.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fnl.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fno.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fnl.a);
      return fnp.a($$0, 64, 32);
   }

   public static final class a extends flf {
      public final fnj a;
      public final fnj b;
      public final fnj c;
      public final fnj d;

      public a(fnj $$0) {
         super(fub::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(djp $$0) {
         boolean $$1 = !($$0.b() instanceof cxx);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dkf.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(eqk $$0, eqo $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
