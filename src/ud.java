import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ud {
   private static final char a = ' ';
   private static final char b = '_';
   private static final char c = '+';
   private static final char d = 'x';
   private static final char e = 'X';
   private final Collection<ts> f = Lists.newArrayList();
   private final Collection<tt> g = Lists.newArrayList();

   public ud() {
   }

   public ud(Collection<ts> $$0) {
      this.f.addAll($$0);
   }

   public void a(ts $$0) {
      this.f.add($$0);
      this.g.forEach($$0::a);
   }

   public void a(tt $$0) {
      this.g.add($$0);
      this.f.forEach($$1 -> $$1.a($$0));
   }

   public void a(final Consumer<ts> $$0) {
      this.a(new tt() {
         @Override
         public void a(ts $$0x) {
         }

         @Override
         public void a(ts $$0x, tv $$1) {
         }

         @Override
         public void b(ts $$0x, tv $$1) {
            $$0.accept($$0);
         }

         @Override
         public void a(ts $$0x, ts $$1, tv $$2) {
         }
      });
   }

   public int a() {
      return (int)this.f.stream().filter(ts::i).filter(ts::r).count();
   }

   public int b() {
      return (int)this.f.stream().filter(ts::i).filter(ts::s).count();
   }

   public int c() {
      return (int)this.f.stream().filter(ts::k).count();
   }

   public boolean d() {
      return this.a() > 0;
   }

   public boolean e() {
      return this.b() > 0;
   }

   public Collection<ts> f() {
      return this.f.stream().filter(ts::i).filter(ts::r).collect(Collectors.toList());
   }

   public Collection<ts> g() {
      return this.f.stream().filter(ts::i).filter(ts::s).collect(Collectors.toList());
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

   public void b(ts $$0) {
      this.f.remove($$0);
   }
}
