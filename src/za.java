import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class za implements va<ws> {
   private final za.a a;
   private final List<aeu> b;
   private final List<aeu> c;
   private final apd d;

   public za(za.a $$0, Collection<aeu> $$1, Collection<aeu> $$2, apd $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public za(sl $$0) {
      this.a = $$0.b(za.a.class);
      this.d = apd.a($$0);
      this.b = $$0.a(sl::s);
      if (this.a == za.a.a) {
         this.c = $$0.a(sl::s);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, sl::a);
      if (this.a == za.a.a) {
         $$0.a(this.c, sl::a);
      }
   }

   public void a(ws $$0) {
      $$0.a(this);
   }

   public List<aeu> a() {
      return this.b;
   }

   public List<aeu> d() {
      return this.c;
   }

   public apd e() {
      return this.d;
   }

   public za.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
