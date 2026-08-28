import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fut extends fpt {
   private static final xd a = xd.c("selectWorld.experiments");
   private static final xd b = xd.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final fno d = new fno(this);
   private final fpt s;
   private final aud u;
   private final Consumer<aud> v;
   private final Object2BooleanMap<aua> w = new Object2BooleanLinkedOpenHashMap();

   public fut(fpt $$0, aud $$1, Consumer<aud> $$2) {
      super(a);
      this.s = $$0;
      this.u = $$1;
      this.v = $$2;

      for (aua $$3 : $$1.c()) {
         if ($$3.l() == aue.d) {
            this.w.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aT_() {
      this.d.a(a, this.p);
      fns $$0 = this.d.c(fns.d());
      $$0.a(new fku(b, this.p).d(310), $$0x -> $$0x.e(15));
      fux.a $$1 = fux.a(310).a(2, true).b(4);
      this.w.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.w.getBoolean($$1x), $$1xx -> this.w.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fns $$2 = this.d.b(fns.e().a(8));
      $$2.a(fka.a(xc.d, $$0x -> this.m()).a());
      $$2.a(fka.a(xc.e, $$0x -> this.d()).a());
      this.d.a($$1x -> {
         fjy var10000 = this.c($$1x);
      });
      this.c();
   }

   private static xd a(aua $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (xd)(gxr.a($$1) ? xd.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public xd i() {
      return xc.a(super.i(), b);
   }

   @Override
   public void d() {
      this.m.a(this.s);
   }

   private void m() {
      List<aua> $$0 = new ArrayList<>(this.u.f());
      List<aua> $$1 = new ArrayList<>();
      this.w.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.u.b($$0.stream().map(aua::g).toList());
      this.v.accept(this.u);
   }
}
