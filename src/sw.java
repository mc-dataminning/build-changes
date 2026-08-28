import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class sw {
   private static final char a = ' ';
   private static final char b = '_';
   private static final char c = '+';
   private static final char d = 'x';
   private static final char e = 'X';
   private final Collection<sl> f = Lists.newArrayList();
   private final Collection<sm> g = Lists.newArrayList();

   public sw() {
   }

   public sw(Collection<sl> $$0) {
      this.f.addAll($$0);
   }

   public void a(sl $$0) {
      this.f.add($$0);
      this.g.forEach($$0::a);
   }

   public void a(sm $$0) {
      this.g.add($$0);
      this.f.forEach($$1 -> $$1.a($$0));
   }

   public void a(final Consumer<sl> $$0) {
      this.a(new sm() {
         @Override
         public void a(sl $$0x) {
         }

         @Override
         public void a(sl $$0x, so $$1) {
         }

         @Override
         public void b(sl $$0x, so $$1) {
            $$0.accept($$0);
         }

         @Override
         public void a(sl $$0x, sl $$1, so $$2) {
         }
      });
   }

   public int a() {
      return (int)this.f.stream().filter(sl::i).filter(sl::r).count();
   }

   public int b() {
      return (int)this.f.stream().filter(sl::i).filter(sl::s).count();
   }

   public int c() {
      return (int)this.f.stream().filter(sl::k).count();
   }

   public boolean d() {
      return this.a() > 0;
   }

   public boolean e() {
      return this.b() > 0;
   }

   public Collection<sl> f() {
      return this.f.stream().filter(sl::i).filter(sl::r).collect(Collectors.toList());
   }

   public Collection<sl> g() {
      return this.f.stream().filter(sl::i).filter(sl::s).collect(Collectors.toList());
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

   public void b(sl $$0) {
      this.f.remove($$0);
   }
}
