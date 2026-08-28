import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fyu extends ftr {
   private static final xk a = xk.c("selectWorld.experiments");
   private static final xk b = xk.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final frn d = new frn(this);
   private final ftr s;
   private final auv u;
   private final Consumer<auv> v;
   private final Object2BooleanMap<aus> w = new Object2BooleanLinkedOpenHashMap();

   public fyu(ftr $$0, auv $$1, Consumer<auv> $$2) {
      super(a);
      this.s = $$0;
      this.u = $$1;
      this.v = $$2;

      for (aus $$3 : $$1.d()) {
         if ($$3.l() == auw.d) {
            this.w.put($$3, $$1.g().contains($$3));
         }
      }
   }

   @Override
   protected void aT_() {
      this.d.a(a, this.p);
      frr $$0 = this.d.c(frr.d());
      $$0.a(new fot(b, this.p).d(310), $$0x -> $$0x.e(15));
      fyz.a $$1 = fyz.a(310).a(2, true).b(4);
      this.w.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.w.getBoolean($$1x), $$1xx -> this.w.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      frr $$2 = this.d.b(frr.e().a(8));
      $$2.a(fny.a(xj.d, $$0x -> this.l()).a());
      $$2.a(fny.a(xj.e, $$0x -> this.aP_()).a());
      this.d.a($$1x -> {
         fnw var10000 = this.c($$1x);
      });
      this.c();
   }

   private static xk a(aus $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (xk)(hcn.a($$1) ? xk.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public xk i() {
      return xj.a(super.i(), b);
   }

   @Override
   public void aP_() {
      this.m.a(this.s);
   }

   private void l() {
      List<aus> $$0 = new ArrayList<>(this.u.g());
      List<aus> $$1 = new ArrayList<>();
      this.w.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.u.b($$0.stream().map(aus::g).toList());
      this.v.accept(this.u);
   }
}
