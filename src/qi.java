import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class qi {
   private static final char a = ' ';
   private static final char b = '_';
   private static final char c = '+';
   private static final char d = 'x';
   private static final char e = 'X';
   private final Collection<px> f = Lists.newArrayList();
   @Nullable
   private final Collection<py> g = Lists.newArrayList();

   public qi() {
   }

   public qi(Collection<px> $$0) {
      this.f.addAll($$0);
   }

   public void a(px $$0) {
      this.f.add($$0);
      this.g.forEach($$0::a);
   }

   public void a(py $$0) {
      this.g.add($$0);
      this.f.forEach($$1 -> $$1.a($$0));
   }

   public void a(final Consumer<px> $$0) {
      this.a(new py() {
         @Override
         public void a(px $$0x) {
         }

         @Override
         public void b(px $$0x) {
         }

         @Override
         public void c(px $$0x) {
            $$0.accept($$0);
         }
      });
   }

   public int a() {
      return (int)this.f.stream().filter(px::i).filter(px::r).count();
   }

   public int b() {
      return (int)this.f.stream().filter(px::i).filter(px::s).count();
   }

   public int c() {
      return (int)this.f.stream().filter(px::k).count();
   }

   public boolean d() {
      return this.a() > 0;
   }

   public boolean e() {
      return this.b() > 0;
   }

   public Collection<px> f() {
      return this.f.stream().filter(px::i).filter(px::r).collect(Collectors.toList());
   }

   public Collection<px> g() {
      return this.f.stream().filter(px::i).filter(px::s).collect(Collectors.toList());
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
}
