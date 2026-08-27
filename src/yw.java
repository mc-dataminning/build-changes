import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class yw implements uw<wo> {
   private final yw.a a;
   private final List<aep> b;
   private final List<aep> c;
   private final aoy d;

   public yw(yw.a $$0, Collection<aep> $$1, Collection<aep> $$2, aoy $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public yw(sh $$0) {
      this.a = $$0.b(yw.a.class);
      this.d = aoy.a($$0);
      this.b = $$0.a(sh::s);
      if (this.a == yw.a.a) {
         this.c = $$0.a(sh::s);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, sh::a);
      if (this.a == yw.a.a) {
         $$0.a(this.c, sh::a);
      }
   }

   public void a(wo $$0) {
      $$0.a(this);
   }

   public List<aep> a() {
      return this.b;
   }

   public List<aep> d() {
      return this.c;
   }

   public aoy e() {
      return this.d;
   }

   public yw.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
