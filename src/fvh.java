import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fvh extends fqh {
   private static final xe a = xe.c("selectWorld.experiments");
   private static final xe b = xe.c("selectWorld.experiments.info").a(n.m);
   private static final int c = 310;
   private final foc d = new foc(this);
   private final fqh s;
   private final aug u;
   private final Consumer<aug> v;
   private final Object2BooleanMap<aud> w = new Object2BooleanLinkedOpenHashMap();

   public fvh(fqh $$0, aug $$1, Consumer<aug> $$2) {
      super(a);
      this.s = $$0;
      this.u = $$1;
      this.v = $$2;

      for (aud $$3 : $$1.c()) {
         if ($$3.l() == auh.d) {
            this.w.put($$3, $$1.f().contains($$3));
         }
      }
   }

   @Override
   protected void aS_() {
      this.d.a(a, this.p);
      fog $$0 = this.d.c(fog.d());
      $$0.a(new fli(b, this.p).d(310), $$0x -> $$0x.e(15));
      fvl.a $$1 = fvl.a(310).a(2, true).b(4);
      this.w.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.w.getBoolean($$1x), $$1xx -> this.w.put($$1x, $$1xx)).a($$1x.c()));
      $$1.a($$0::a);
      fog $$2 = this.d.b(fog.e().a(8));
      $$2.a(fko.a(xd.d, $$0x -> this.m()).a());
      $$2.a(fko.a(xd.e, $$0x -> this.d()).a());
      this.d.a($$1x -> {
         fkm var10000 = this.c($$1x);
      });
      this.c();
   }

   private static xe a(aud $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (xe)(gyn.a($$1) ? xe.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public xe i() {
      return xd.a(super.i(), b);
   }

   @Override
   public void d() {
      this.m.a(this.s);
   }

   private void m() {
      List<aud> $$0 = new ArrayList<>(this.u.f());
      List<aud> $$1 = new ArrayList<>();
      this.w.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.u.b($$0.stream().map(aud::g).toList());
      this.v.accept(this.u);
   }
}
