import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class tm {
   private static final char a = ' ';
   private static final char b = '_';
   private static final char c = '+';
   private static final char d = 'x';
   private static final char e = 'X';
   private final Collection<tb> f = Lists.newArrayList();
   private final Collection<tc> g = Lists.newArrayList();

   public tm() {
   }

   public tm(Collection<tb> $$0) {
      this.f.addAll($$0);
   }

   public void a(tb $$0) {
      this.f.add($$0);
      this.g.forEach($$0::a);
   }

   public void a(tc $$0) {
      this.g.add($$0);
      this.f.forEach($$1 -> $$1.a($$0));
   }

   public void a(final Consumer<tb> $$0) {
      this.a(new tc() {
         @Override
         public void a(tb $$0x) {
         }

         @Override
         public void a(tb $$0x, te $$1) {
         }

         @Override
         public void b(tb $$0x, te $$1) {
            $$0.accept($$0);
         }

         @Override
         public void a(tb $$0x, tb $$1, te $$2) {
         }
      });
   }

   public int a() {
      return (int)this.f.stream().filter(tb::h).filter(tb::q).count();
   }

   public int b() {
      return (int)this.f.stream().filter(tb::h).filter(tb::r).count();
   }

   public int c() {
      return (int)this.f.stream().filter(tb::j).count();
   }

   public boolean d() {
      return this.a() > 0;
   }

   public boolean e() {
      return this.b() > 0;
   }

   public Collection<tb> f() {
      return this.f.stream().filter(tb::h).filter(tb::q).collect(Collectors.toList());
   }

   public Collection<tb> g() {
      return this.f.stream().filter(tb::h).filter(tb::r).collect(Collectors.toList());
   }

   public int h() {
      return this.f.size();
   }

   public boolean i() {
      return this.c() == this.h();
   }

   public String j() {
      StringBuffer $$0 = new StringBuffer();
      $$0.append('[');
      this.f.forEach($$1 -> {
         if (!$$1.i()) {
            $$0.append(' ');
         } else if ($$1.g()) {
            $$0.append('+');
         } else if ($$1.h()) {
            $$0.append((char)($$1.q() ? 'X' : 'x'));
         } else {
            $$0.append('_');
         }
      });
      $$0.append(']');
      return $$0.toString();
   }

   @Override
   public String toString() {
      return this.j();
   }

   public void b(tb $$0) {
      this.f.remove($$0);
   }
}
