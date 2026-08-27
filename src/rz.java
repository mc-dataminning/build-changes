import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class rz {
   private static final char a = ' ';
   private static final char b = '_';
   private static final char c = '+';
   private static final char d = 'x';
   private static final char e = 'X';
   private final Collection<ro> f = Lists.newArrayList();
   @Nullable
   private final Collection<rp> g = Lists.newArrayList();

   public rz() {
   }

   public rz(Collection<ro> $$0) {
      this.f.addAll($$0);
   }

   public void a(ro $$0) {
      this.f.add($$0);
      this.g.forEach($$0::a);
   }

   public void a(rp $$0) {
      this.g.add($$0);
      this.f.forEach($$1 -> $$1.a($$0));
   }

   public void a(final Consumer<ro> $$0) {
      this.a(new rp() {
         @Override
         public void a(ro $$0x) {
         }

         @Override
         public void b(ro $$0x) {
         }

         @Override
         public void c(ro $$0x) {
            $$0.accept($$0);
         }
      });
   }

   public int a() {
      return (int)this.f.stream().filter(ro::j).filter(ro::s).count();
   }

   public int b() {
      return (int)this.f.stream().filter(ro::j).filter(ro::t).count();
   }

   public int c() {
      return (int)this.f.stream().filter(ro::l).count();
   }

   public boolean d() {
      return this.a() > 0;
   }

   public boolean e() {
      return this.b() > 0;
   }

   public Collection<ro> f() {
      return this.f.stream().filter(ro::j).filter(ro::s).collect(Collectors.toList());
   }

   public Collection<ro> g() {
      return this.f.stream().filter(ro::j).filter(ro::t).collect(Collectors.toList());
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
