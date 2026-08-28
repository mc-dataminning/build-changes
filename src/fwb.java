import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fwb extends fra {
   private static final xi a = xi.c("selectWorld.experiments");
   private static final xi b = xi.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final fow d = new fow(this);
   private final fra s;
   private final aul u;
   private final Consumer<aul> v;
   private final Object2BooleanMap<aui> w = new Object2BooleanLinkedOpenHashMap();

   public fwb(fra $$0, aul $$1, Consumer<aul> $$2) {
      super(a);
      this.s = $$0;
      this.u = $$1;
      this.v = $$2;

      for (aui $$3 : $$1.d()) {
         if ($$3.l() == aum.d) {
            this.w.put($$3, $$1.g().contains($$3));
         }
      }
   }

   @Override
   protected void aR_() {
      this.d.a(a, this.p);
      fpa $$0 = this.d.c(fpa.d());
      $$0.a(new fmb(b, this.p).d(310), $$0x -> $$0x.e(15));
      fwg.a $$1 = fwg.a(310).a(2, true).b(4);
      this.w.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.w.getBoolean($$1x), $$1xx -> this.w.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fpa $$2 = this.d.b(fpa.e().a(8));
      $$2.a(flh.a(xh.d, $$0x -> this.m()).a());
      $$2.a(flh.a(xh.e, $$0x -> this.d()).a());
      this.d.a($$1x -> {
         flf var10000 = this.c($$1x);
      });
      this.c();
   }

   private static xi a(aui $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (xi)(gzk.a($$1) ? xi.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public xi i() {
      return xh.a(super.i(), b);
   }

   @Override
   public void d() {
      this.m.a(this.s);
   }

   private void m() {
      List<aui> $$0 = new ArrayList<>(this.u.g());
      List<aui> $$1 = new ArrayList<>();
      this.w.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.u.b($$0.stream().map(aui::g).toList());
      this.v.accept(this.u);
   }
}
