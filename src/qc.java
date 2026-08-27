import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class qc {
   private static final char a = ' ';
   private static final char b = '_';
   private static final char c = '+';
   private static final char d = 'x';
   private static final char e = 'X';
   private final Collection<pr> f = Lists.newArrayList();
   @Nullable
   private final Collection<ps> g = Lists.newArrayList();

   public qc() {
   }

   public qc(Collection<pr> $$0) {
      this.f.addAll($$0);
   }

   public void a(pr $$0) {
      this.f.add($$0);
      this.g.forEach($$0::a);
   }

   public void a(ps $$0) {
      this.g.add($$0);
      this.f.forEach($$1 -> $$1.a($$0));
   }

   public void a(final Consumer<pr> $$0) {
      this.a(new ps() {
         @Override
         public void a(pr $$0x) {
         }

         @Override
         public void b(pr $$0x) {
         }

         @Override
         public void c(pr $$0x) {
            $$0.accept($$0);
         }
      });
   }

   public int a() {
      return (int)this.f.stream().filter(pr::i).filter(pr::r).count();
   }

   public int b() {
      return (int)this.f.stream().filter(pr::i).filter(pr::s).count();
   }

   public int c() {
      return (int)this.f.stream().filter(pr::k).count();
   }

   public boolean d() {
      return this.a() > 0;
   }

   public boolean e() {
      return this.b() > 0;
   }

   public Collection<pr> f() {
      return this.f.stream().filter(pr::i).filter(pr::r).collect(Collectors.toList());
   }

   public Collection<pr> g() {
      return this.f.stream().filter(pr::i).filter(pr::s).collect(Collectors.toList());
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
