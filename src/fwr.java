import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fwr extends frp {
   private static final xl a = xl.c("selectWorld.experiments");
   private static final xl b = xl.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final fpl d = new fpl(this);
   private final frp s;
   private final auo u;
   private final Consumer<auo> v;
   private final Object2BooleanMap<aul> w = new Object2BooleanLinkedOpenHashMap();

   public fwr(frp $$0, auo $$1, Consumer<auo> $$2) {
      super(a);
      this.s = $$0;
      this.u = $$1;
      this.v = $$2;

      for (aul $$3 : $$1.d()) {
         if ($$3.l() == aup.d) {
            this.w.put($$3, $$1.g().contains($$3));
         }
      }
   }

   @Override
   protected void aS_() {
      this.d.a(a, this.p);
      fpp $$0 = this.d.c(fpp.d());
      $$0.a(new fmq(b, this.p).d(310), $$0x -> $$0x.e(15));
      fww.a $$1 = fww.a(310).a(2, true).b(4);
      this.w.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.w.getBoolean($$1x), $$1xx -> this.w.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fpp $$2 = this.d.b(fpp.e().a(8));
      $$2.a(flw.a(xk.d, $$0x -> this.m()).a());
      $$2.a(flw.a(xk.e, $$0x -> this.aP_()).a());
      this.d.a($$1x -> {
         flu var10000 = this.c($$1x);
      });
      this.c();
   }

   private static xl a(aul $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (xl)(haa.a($$1) ? xl.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public xl i() {
      return xk.a(super.i(), b);
   }

   @Override
   public void aP_() {
      this.m.a(this.s);
   }

   private void m() {
      List<aul> $$0 = new ArrayList<>(this.u.g());
      List<aul> $$1 = new ArrayList<>();
      this.w.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.u.b($$0.stream().map(aul::g).toList());
      this.v.accept(this.u);
   }
}
