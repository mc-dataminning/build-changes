import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class tt {
   private static final char a = ' ';
   private static final char b = '_';
   private static final char c = '+';
   private static final char d = 'x';
   private static final char e = 'X';
   private final Collection<ti> f = Lists.newArrayList();
   private final Collection<tj> g = Lists.newArrayList();

   public tt() {
   }

   public tt(Collection<ti> $$0) {
      this.f.addAll($$0);
   }

   public void a(ti $$0) {
      this.f.add($$0);
      this.g.forEach($$0::a);
   }

   public void a(tj $$0) {
      this.g.add($$0);
      this.f.forEach($$1 -> $$1.a($$0));
   }

   public void a(final Consumer<ti> $$0) {
      this.a(new tj() {
         @Override
         public void a(ti $$0x) {
         }

         @Override
         public void a(ti $$0x, tl $$1) {
         }

         @Override
         public void b(ti $$0x, tl $$1) {
            $$0.accept($$0);
         }

         @Override
         public void a(ti $$0x, ti $$1, tl $$2) {
         }
      });
   }

   public int a() {
      return (int)this.f.stream().filter(ti::i).filter(ti::r).count();
   }

   public int b() {
      return (int)this.f.stream().filter(ti::i).filter(ti::s).count();
   }

   public int c() {
      return (int)this.f.stream().filter(ti::k).count();
   }

   public boolean d() {
      return this.a() > 0;
   }

   public boolean e() {
      return this.b() > 0;
   }

   public Collection<ti> f() {
      return this.f.stream().filter(ti::i).filter(ti::r).collect(Collectors.toList());
   }

   public Collection<ti> g() {
      return this.f.stream().filter(ti::i).filter(ti::s).collect(Collectors.toList());
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

   public void b(ti $$0) {
      this.f.remove($$0);
   }
}
