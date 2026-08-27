import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class ze implements ve<wx> {
   private final ze.a a;
   private final List<aex> b;
   private final List<aex> c;
   private final api d;

   public ze(ze.a $$0, Collection<aex> $$1, Collection<aex> $$2, api $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public ze(sp $$0) {
      this.a = $$0.b(ze.a.class);
      this.d = api.a($$0);
      this.b = $$0.a(sp::s);
      if (this.a == ze.a.a) {
         this.c = $$0.a(sp::s);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, sp::a);
      if (this.a == ze.a.a) {
         $$0.a(this.c, sp::a);
      }
   }

   public void a(wx $$0) {
      $$0.a(this);
   }

   public List<aex> a() {
      return this.b;
   }

   public List<aex> d() {
      return this.c;
   }

   public api e() {
      return this.d;
   }

   public ze.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
