import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class th {
   private static final char a = ' ';
   private static final char b = '_';
   private static final char c = '+';
   private static final char d = 'x';
   private static final char e = 'X';
   private final Collection<sw> f = Lists.newArrayList();
   private final Collection<sx> g = Lists.newArrayList();

   public th() {
   }

   public th(Collection<sw> $$0) {
      this.f.addAll($$0);
   }

   public void a(sw $$0) {
      this.f.add($$0);
      this.g.forEach($$0::a);
   }

   public void a(sx $$0) {
      this.g.add($$0);
      this.f.forEach($$1 -> $$1.a($$0));
   }

   public void a(final Consumer<sw> $$0) {
      this.a(new sx() {
         @Override
         public void a(sw $$0x) {
         }

         @Override
         public void a(sw $$0x, sz $$1) {
         }

         @Override
         public void b(sw $$0x, sz $$1) {
            $$0.accept($$0);
         }

         @Override
         public void a(sw $$0x, sw $$1, sz $$2) {
         }
      });
   }

   public int a() {
      return (int)this.f.stream().filter(sw::h).filter(sw::q).count();
   }

   public int b() {
      return (int)this.f.stream().filter(sw::h).filter(sw::r).count();
   }

   public int c() {
      return (int)this.f.stream().filter(sw::j).count();
   }

   public boolean d() {
      return this.a() > 0;
   }

   public boolean e() {
      return this.b() > 0;
   }

   public Collection<sw> f() {
      return this.f.stream().filter(sw::h).filter(sw::q).collect(Collectors.toList());
   }

   public Collection<sw> g() {
      return this.f.stream().filter(sw::h).filter(sw::r).collect(Collectors.toList());
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

   public void b(sw $$0) {
      this.f.remove($$0);
   }
}
