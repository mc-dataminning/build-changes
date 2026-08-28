import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class tc {
   private static final char a = ' ';
   private static final char b = '_';
   private static final char c = '+';
   private static final char d = 'x';
   private static final char e = 'X';
   private final Collection<so> f = Lists.newArrayList();
   private final Collection<sr> g = Lists.newArrayList();

   public tc() {
   }

   public tc(Collection<so> $$0) {
      this.f.addAll($$0);
   }

   public void a(so $$0) {
      this.f.add($$0);
      this.g.forEach($$0::a);
   }

   public void a(sr $$0) {
      this.g.add($$0);
      this.f.forEach($$1 -> $$1.a($$0));
   }

   public void a(final Consumer<so> $$0) {
      this.a(new sr() {
         @Override
         public void a(so $$0x) {
         }

         @Override
         public void a(so $$0x, st $$1) {
         }

         @Override
         public void b(so $$0x, st $$1) {
            $$0.accept($$0);
         }

         @Override
         public void a(so $$0x, so $$1, st $$2) {
         }
      });
   }

   public int a() {
      return (int)this.f.stream().filter(so::i).filter(so::r).count();
   }

   public int b() {
      return (int)this.f.stream().filter(so::i).filter(so::s).count();
   }

   public int c() {
      return (int)this.f.stream().filter(so::k).count();
   }

   public boolean d() {
      return this.a() > 0;
   }

   public boolean e() {
      return this.b() > 0;
   }

   public Collection<so> f() {
      return this.f.stream().filter(so::i).filter(so::r).collect(Collectors.toList());
   }

   public Collection<so> g() {
      return this.f.stream().filter(so::i).filter(so::s).collect(Collectors.toList());
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
         if (!$$1.j()) {
            $$0.append(' ');
         } else if ($$1.h()) {
            $$0.append('+');
         } else if ($$1.i()) {
            $$0.append((char)($$1.r() ? 'X' : 'x'));
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

   public void b(so $$0) {
      this.f.remove($$0);
   }
}
