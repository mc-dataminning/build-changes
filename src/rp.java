import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class rp {
   private static final char a = ' ';
   private static final char b = '_';
   private static final char c = '+';
   private static final char d = 'x';
   private static final char e = 'X';
   private final Collection<re> f = Lists.newArrayList();
   @Nullable
   private final Collection<rf> g = Lists.newArrayList();

   public rp() {
   }

   public rp(Collection<re> $$0) {
      this.f.addAll($$0);
   }

   public void a(re $$0) {
      this.f.add($$0);
      this.g.forEach($$0::a);
   }

   public void a(rf $$0) {
      this.g.add($$0);
      this.f.forEach($$1 -> $$1.a($$0));
   }

   public void a(final Consumer<re> $$0) {
      this.a(new rf() {
         @Override
         public void a(re $$0x) {
         }

         @Override
         public void b(re $$0x) {
         }

         @Override
         public void c(re $$0x) {
            $$0.accept($$0);
         }
      });
   }

   public int a() {
      return (int)this.f.stream().filter(re::j).filter(re::s).count();
   }

   public int b() {
      return (int)this.f.stream().filter(re::j).filter(re::t).count();
   }

   public int c() {
      return (int)this.f.stream().filter(re::l).count();
   }

   public boolean d() {
      return this.a() > 0;
   }

   public boolean e() {
      return this.b() > 0;
   }

   public Collection<re> f() {
      return this.f.stream().filter(re::j).filter(re::s).collect(Collectors.toList());
   }

   public Collection<re> g() {
      return this.f.stream().filter(re::j).filter(re::t).collect(Collectors.toList());
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
