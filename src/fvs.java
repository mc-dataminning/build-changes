import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fvs extends fqs {
   private static final xh a = xh.c("selectWorld.experiments");
   private static final xh b = xh.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final fon d = new fon(this);
   private final fqs s;
   private final auk u;
   private final Consumer<auk> v;
   private final Object2BooleanMap<auh> w = new Object2BooleanLinkedOpenHashMap();

   public fvs(fqs $$0, auk $$1, Consumer<auk> $$2) {
      super(a);
      this.s = $$0;
      this.u = $$1;
      this.v = $$2;

      for (auh $$3 : $$1.d()) {
         if ($$3.l() == aul.d) {
            this.w.put($$3, $$1.g().contains($$3));
         }
      }
   }

   @Override
   protected void aS_() {
      this.d.a(a, this.p);
      fos $$0 = this.d.c(fos.d());
      $$0.a(new flt(b, this.p).d(310), $$0x -> $$0x.e(15));
      fvw.a $$1 = fvw.a(310).a(2, true).b(4);
      this.w.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.w.getBoolean($$1x), $$1xx -> this.w.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fos $$2 = this.d.b(fos.e().a(8));
      $$2.a(fkz.a(xg.d, $$0x -> this.m()).a());
      $$2.a(fkz.a(xg.e, $$0x -> this.d()).a());
      this.d.a($$1x -> {
         fkx var10000 = this.c($$1x);
      });
      this.c();
   }

   private static xh a(auh $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (xh)(gyz.a($$1) ? xh.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public xh i() {
      return xg.a(super.i(), b);
   }

   @Override
   public void d() {
      this.m.a(this.s);
   }

   private void m() {
      List<auh> $$0 = new ArrayList<>(this.u.g());
      List<auh> $$1 = new ArrayList<>();
      this.w.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.u.b($$0.stream().map(auh::g).toList());
      this.v.accept(this.u);
   }
}
