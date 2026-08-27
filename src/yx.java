import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class yx implements ux<wp> {
   private final yx.a a;
   private final List<aer> b;
   private final List<aer> c;
   private final apa d;

   public yx(yx.a $$0, Collection<aer> $$1, Collection<aer> $$2, apa $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public yx(si $$0) {
      this.a = $$0.b(yx.a.class);
      this.d = apa.a($$0);
      this.b = $$0.a(si::s);
      if (this.a == yx.a.a) {
         this.c = $$0.a(si::s);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, si::a);
      if (this.a == yx.a.a) {
         $$0.a(this.c, si::a);
      }
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public List<aer> a() {
      return this.b;
   }

   public List<aer> d() {
      return this.c;
   }

   public apa e() {
      return this.d;
   }

   public yx.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
