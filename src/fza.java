import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class fza extends fzb {
   private static final xa d = xa.c("chat.copy");
   private static final xa s = xa.c("chat.link.warning");
   private final String u;
   private final boolean v;

   public fza(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), xa.b($$1), $$1, $$2 ? wz.e : wz.g, $$2);
   }

   public fza(BooleanConsumer $$0, xa $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? wz.e : wz.g, $$3);
   }

   public fza(BooleanConsumer $$0, xa $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public fza(BooleanConsumer $$0, xa $$1, xa $$2, URI $$3, xa $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public fza(BooleanConsumer $$0, xa $$1, xa $$2, String $$3, xa $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (xa)($$5 ? xa.c("chat.link.open") : wz.f);
      this.b = $$4;
      this.v = !$$5;
      this.u = $$3;
   }

   protected static xo a(boolean $$0, String $$1) {
      return c($$0).b(wz.v).b(xa.b($$1));
   }

   protected static xo c(boolean $$0) {
      return xa.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(ful.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(ful.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(ful.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.p.a(this.u);
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.v) {
         $$0.a(this.p, s, this.n / 2, 110, 16764108);
      }
   }

   public static void a(gad $$0, String $$1, boolean $$2) {
      frd $$3 = frd.Q();
      $$3.a(new fza($$3x -> {
         if ($$3x) {
            ag.n().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(gad $$0, URI $$1, boolean $$2) {
      frd $$3 = frd.Q();
      $$3.a(new fza($$3x -> {
         if ($$3x) {
            ag.n().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(gad $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(gad $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static ful.c b(gad $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static ful.c b(gad $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static ful.c b(gad $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static ful.c b(gad $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
