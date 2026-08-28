import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fyz extends ftw {
   private static final xv a = xv.c("selectWorld.experiments");
   private static final xv b = xv.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final frs d = new frs(this);
   private final ftw s;
   private final avg u;
   private final Consumer<avg> v;
   private final Object2BooleanMap<avd> w = new Object2BooleanLinkedOpenHashMap();

   public fyz(ftw $$0, avg $$1, Consumer<avg> $$2) {
      super(a);
      this.s = $$0;
      this.u = $$1;
      this.v = $$2;

      for (avd $$3 : $$1.d()) {
         if ($$3.l() == avh.d) {
            this.w.put($$3, $$1.g().contains($$3));
         }
      }
   }

   @Override
   protected void aT_() {
      this.d.a(a, this.p);
      frw $$0 = this.d.c(frw.d());
      $$0.a(new foy(b, this.p).d(310), $$0x -> $$0x.e(15));
      fze.a $$1 = fze.a(310).a(2, true).b(4);
      this.w.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.w.getBoolean($$1x), $$1xx -> this.w.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      frw $$2 = this.d.b(frw.e().a(8));
      $$2.a(fod.a(xu.d, $$0x -> this.l()).a());
      $$2.a(fod.a(xu.e, $$0x -> this.aP_()).a());
      this.d.a($$1x -> {
         fob var10000 = this.c($$1x);
      });
      this.c();
   }

   private static xv a(avd $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (xv)(hcq.a($$1) ? xv.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public xv i() {
      return xu.a(super.i(), b);
   }

   @Override
   public void aP_() {
      this.m.a(this.s);
   }

   private void l() {
      List<avd> $$0 = new ArrayList<>(this.u.g());
      List<avd> $$1 = new ArrayList<>();
      this.w.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.u.b($$0.stream().map(avd::g).toList());
      this.v.accept(this.u);
   }
}
