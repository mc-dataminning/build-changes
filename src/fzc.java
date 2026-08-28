import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class fzc extends fzd {
   private static final xc d = xc.c("chat.copy");
   private static final xc s = xc.c("chat.link.warning");
   private final String u;
   private final boolean v;

   public fzc(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), xc.b($$1), $$1, $$2 ? xb.e : xb.g, $$2);
   }

   public fzc(BooleanConsumer $$0, xc $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? xb.e : xb.g, $$3);
   }

   public fzc(BooleanConsumer $$0, xc $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public fzc(BooleanConsumer $$0, xc $$1, xc $$2, URI $$3, xc $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public fzc(BooleanConsumer $$0, xc $$1, xc $$2, String $$3, xc $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (xc)($$5 ? xc.c("chat.link.open") : xb.f);
      this.b = $$4;
      this.v = !$$5;
      this.u = $$3;
   }

   protected static xq a(boolean $$0, String $$1) {
      return c($$0).b(xb.v).b(xc.b($$1));
   }

   protected static xq c(boolean $$0) {
      return xc.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fun.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fun.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(fun.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.p.a(this.u);
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.v) {
         $$0.a(this.p, s, this.n / 2, 110, 16764108);
      }
   }

   public static void a(gaf $$0, String $$1, boolean $$2) {
      frf $$3 = frf.Q();
      $$3.a(new fzc($$3x -> {
         if ($$3x) {
            ag.n().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(gaf $$0, URI $$1, boolean $$2) {
      frf $$3 = frf.Q();
      $$3.a(new fzc($$3x -> {
         if ($$3x) {
            ag.n().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(gaf $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(gaf $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static fun.c b(gaf $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fun.c b(gaf $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fun.c b(gaf $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static fun.c b(gaf $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
