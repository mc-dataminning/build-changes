import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class fwf extends fwg {
   private static final ww d = ww.c("chat.copy");
   private static final ww s = ww.c("chat.link.warning");
   private final String u;
   private final boolean v;

   public fwf(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), ww.b($$1), $$1, $$2 ? wv.e : wv.g, $$2);
   }

   public fwf(BooleanConsumer $$0, ww $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? wv.e : wv.g, $$3);
   }

   public fwf(BooleanConsumer $$0, ww $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public fwf(BooleanConsumer $$0, ww $$1, ww $$2, URI $$3, ww $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public fwf(BooleanConsumer $$0, ww $$1, ww $$2, String $$3, ww $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (ww)($$5 ? ww.c("chat.link.open") : wv.f);
      this.b = $$4;
      this.v = !$$5;
      this.u = $$3;
   }

   protected static xk a(boolean $$0, String $$1) {
      return c($$0).b(wv.v).b(ww.b($$1));
   }

   protected static xk c(boolean $$0) {
      return ww.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(frq.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(frq.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(frq.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.p.a(this.u);
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.v) {
         $$0.a(this.p, s, this.n / 2, 110, 16764108);
      }
   }

   public static void a(fxi $$0, String $$1, boolean $$2) {
      fof $$3 = fof.Q();
      $$3.a(new fwf($$3x -> {
         if ($$3x) {
            af.n().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(fxi $$0, URI $$1, boolean $$2) {
      fof $$3 = fof.Q();
      $$3.a(new fwf($$3x -> {
         if ($$3x) {
            af.n().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(fxi $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(fxi $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static frq.c b(fxi $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static frq.c b(fxi $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static frq.c b(fxi $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static frq.c b(fxi $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
