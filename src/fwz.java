import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fwz extends frw {
   private static final xj a = xj.c("selectWorld.experiments");
   private static final xj b = xj.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final fps d = new fps(this);
   private final frw s;
   private final aun u;
   private final Consumer<aun> v;
   private final Object2BooleanMap<auk> w = new Object2BooleanLinkedOpenHashMap();

   public fwz(frw $$0, aun $$1, Consumer<aun> $$2) {
      super(a);
      this.s = $$0;
      this.u = $$1;
      this.v = $$2;

      for (auk $$3 : $$1.d()) {
         if ($$3.l() == auo.d) {
            this.w.put($$3, $$1.g().contains($$3));
         }
      }
   }

   @Override
   protected void aR_() {
      this.d.a(a, this.p);
      fpw $$0 = this.d.c(fpw.d());
      $$0.a(new fmx(b, this.p).d(310), $$0x -> $$0x.e(15));
      fxe.a $$1 = fxe.a(310).a(2, true).b(4);
      this.w.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.w.getBoolean($$1x), $$1xx -> this.w.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fpw $$2 = this.d.b(fpw.e().a(8));
      $$2.a(fmd.a(xi.d, $$0x -> this.m()).a());
      $$2.a(fmd.a(xi.e, $$0x -> this.aO_()).a());
      this.d.a($$1x -> {
         fmb var10000 = this.c($$1x);
      });
      this.c();
   }

   private static xj a(auk $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (xj)(hal.a($$1) ? xj.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public xj i() {
      return xi.a(super.i(), b);
   }

   @Override
   public void aO_() {
      this.m.a(this.s);
   }

   private void m() {
      List<auk> $$0 = new ArrayList<>(this.u.g());
      List<auk> $$1 = new ArrayList<>();
      this.w.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.u.b($$0.stream().map(auk::g).toList());
      this.v.accept(this.u);
   }
}
