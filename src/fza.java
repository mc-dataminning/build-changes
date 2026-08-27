import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fza extends fze {
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
   private static final eov k = new eov(0.0, -0.32F, 0.073F);
   private final Map<dnr, fza.a> l;

   public fza(fyr.a $$0) {
      super($$0);
      this.l = dnr.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fza.a($$0.a(fqe.b($$1)))));
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
   public void a(dku $$0, float $$1, etd $$2, fwq $$3, int $$4, int $$5) {
      dme $$6 = $$0.n();
      dge $$7 = (dge)$$6.b();
      dnr $$8 = dge.a($$7);
      fza.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(etd $$0, float $$1, dme $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(etd $$0, int $$1, int $$2, foa $$3, eth $$4) {
      fza.a $$5 = (fza.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gkc a(dnr $$0) {
      return fxf.b($$0);
   }

   @Override
   eov d() {
      return k;
   }

   public static fql e() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      $$1.a("board", fqk.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fqh.a);
      $$1.a("plank", fqk.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fqh.a);
      fqo $$2 = $$1.a("normalChains", fqk.c(), fqh.a);
      $$2.a("chainL1", fqk.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fqh.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fqk.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fqh.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fqk.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fqh.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fqk.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fqh.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fqk.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fqh.a);
      return fql.a($$0, 64, 32);
   }

   public static final class a extends foa {
      public final fqf a;
      public final fqf b;
      public final fqf c;
      public final fqf d;

      public a(fqf $$0) {
         super(fwy::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dme $$0) {
         boolean $$1 = !($$0.b() instanceof dae);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dmu.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(etd $$0, eth $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
