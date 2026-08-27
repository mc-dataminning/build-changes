import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class xb implements uo<ur> {
   private final xb.a a;
   private final List<acq> b;
   private final List<acq> c;
   private final aml d;

   public xb(xb.a $$0, Collection<acq> $$1, Collection<acq> $$2, aml $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public xb(sf $$0) {
      this.a = $$0.b(xb.a.class);
      this.d = aml.a($$0);
      this.b = $$0.a(sf::t);
      if (this.a == xb.a.a) {
         this.c = $$0.a(sf::t);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(sf $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, sf::a);
      if (this.a == xb.a.a) {
         $$0.a(this.c, sf::a);
      }
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public List<acq> a() {
      return this.b;
   }

   public List<acq> c() {
      return this.c;
   }

   public aml d() {
      return this.d;
   }

   public xb.a e() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
