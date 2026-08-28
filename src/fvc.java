import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class fvc extends fvd {
   private static final wv d = wv.c("chat.copy");
   private static final wv s = wv.c("chat.link.warning");
   private final String u;
   private final boolean v;

   public fvc(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), wv.b($$1), $$1, $$2 ? wu.e : wu.g, $$2);
   }

   public fvc(BooleanConsumer $$0, wv $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? wu.e : wu.g, $$3);
   }

   public fvc(BooleanConsumer $$0, wv $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public fvc(BooleanConsumer $$0, wv $$1, wv $$2, URI $$3, wv $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public fvc(BooleanConsumer $$0, wv $$1, wv $$2, String $$3, wv $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (wv)($$5 ? wv.c("chat.link.open") : wu.f);
      this.b = $$4;
      this.v = !$$5;
      this.u = $$3;
   }

   protected static xj a(boolean $$0, String $$1) {
      return c($$0).b(wu.v).b(wv.b($$1));
   }

   protected static xj c(boolean $$0) {
      return wv.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fqn.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fqn.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(fqn.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.p.a(this.u);
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.v) {
         $$0.a(this.p, s, this.n / 2, 110, 16764108);
      }
   }

   public static void a(fwf $$0, String $$1, boolean $$2) {
      fnd $$3 = fnd.Q();
      $$3.a(new fvc($$3x -> {
         if ($$3x) {
            af.n().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(fwf $$0, URI $$1, boolean $$2) {
      fnd $$3 = fnd.Q();
      $$3.a(new fvc($$3x -> {
         if ($$3x) {
            af.n().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(fwf $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(fwf $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static fqn.c b(fwf $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fqn.c b(fwf $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fqn.c b(fwf $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static fqn.c b(fwf $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
