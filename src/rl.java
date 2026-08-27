import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class rl {
   private static final char a = ' ';
   private static final char b = '_';
   private static final char c = '+';
   private static final char d = 'x';
   private static final char e = 'X';
   private final Collection<ra> f = Lists.newArrayList();
   @Nullable
   private final Collection<rb> g = Lists.newArrayList();

   public rl() {
   }

   public rl(Collection<ra> $$0) {
      this.f.addAll($$0);
   }

   public void a(ra $$0) {
      this.f.add($$0);
      this.g.forEach($$0::a);
   }

   public void a(rb $$0) {
      this.g.add($$0);
      this.f.forEach($$1 -> $$1.a($$0));
   }

   public void a(final Consumer<ra> $$0) {
      this.a(new rb() {
         @Override
         public void a(ra $$0x) {
         }

         @Override
         public void b(ra $$0x) {
         }

         @Override
         public void c(ra $$0x) {
            $$0.accept($$0);
         }
      });
   }

   public int a() {
      return (int)this.f.stream().filter(ra::j).filter(ra::s).count();
   }

   public int b() {
      return (int)this.f.stream().filter(ra::j).filter(ra::t).count();
   }

   public int c() {
      return (int)this.f.stream().filter(ra::l).count();
   }

   public boolean d() {
      return this.a() > 0;
   }

   public boolean e() {
      return this.b() > 0;
   }

   public Collection<ra> f() {
      return this.f.stream().filter(ra::j).filter(ra::s).collect(Collectors.toList());
   }

   public Collection<ra> g() {
      return this.f.stream().filter(ra::j).filter(ra::t).collect(Collectors.toList());
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
         if (!$$1.k()) {
            $$0.append(' ');
         } else if ($$1.i()) {
            $$0.append('+');
         } else if ($$1.j()) {
            $$0.append((char)($$1.s() ? 'X' : 'x'));
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
