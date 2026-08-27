import java.util.List;

public class qu {
   public static final dxv a = dxo.a(dny.a.e);
   public static final dxv b = dxo.a(dny.a.c);
   public static final dxv c = dxo.a(dny.a.a);
   public static final dxv d = dxo.a(dny.a.d);
   public static final dxv e = dxn.a(dos.a(), dos.b());
   public static final dxv f = dxn.a(dos.b(10), dos.c(10));
   public static final dxv g = dxn.a(dos.b(8), dos.c(8));
   public static final dxv h = dxn.a(dos.b(4), dos.c(4));
   public static final dxv i = dxn.a(dos.a(), dos.a(256));

   public static void a(pa<dxs> $$0) {
      qo.a($$0);
      qp.a($$0);
      qq.a($$0);
      qr.a($$0);
      qs.a($$0);
      qt.a($$0);
      qv.a($$0);
      qw.a($$0);
      qx.a($$0);
   }

   public static ags<dxs> a(String $$0) {
      return ags.a(kc.aB, new agt($$0));
   }

   public static void a(pa<dxs> $$0, ags<dxs> $$1, ie<dqp<?, ?>> $$2, List<dxv> $$3) {
      $$0.a($$1, new dxs($$2, List.copyOf($$3)));
   }

   public static void a(pa<dxs> $$0, ags<dxs> $$1, ie<dqp<?, ?>> $$2, dxv... $$3) {
      a($$0, $$1, $$2, List.of($$3));
   }

   public static dxv a(int $$0, float $$1, int $$2) {
      float $$3 = 1.0F / $$1;
      if (Math.abs($$3 - (float)((int)$$3)) > 1.0E-5F) {
         throw new IllegalStateException("Chance data cannot be represented as list weight");
      } else {
         bhv<biq> $$4 = bhv.<biq>a().a(bin.a($$0), (int)$$3 - 1).a(bin.a($$0 + $$2), 1).a();
         return dxl.a(new bix($$4));
      }
   }

   public static dxu a() {
      return dxh.a(dpf.c);
   }

   public static dxh a(cvz $$0) {
      return dxh.a(dpf.a($$0.o(), hv.b));
   }

   public static ie<dxs> a(ie<dqp<?, ?>> $$0, dxv... $$1) {
      return ie.a(new dxs($$0, List.of($$1)));
   }

   public static <FC extends dtg, F extends drc<FC>> ie<dxs> a(F $$0, FC $$1, dxv... $$2) {
      return a(ie.a(new dqp($$0, $$1)), $$2);
   }

   public static <FC extends dtg, F extends drc<FC>> ie<dxs> a(F $$0, FC $$1) {
      return a($$0, $$1, dpf.c);
   }

   public static <FC extends dtg, F extends drc<FC>> ie<dxs> a(F $$0, FC $$1, dpf $$2) {
      return a($$0, $$1, dxh.a($$2));
   }
}
