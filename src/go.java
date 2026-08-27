import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.logging.LogUtils;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class go<T> implements AutoCloseable {
   private static final int a = 10000000;
   private static final Logger b = LogUtils.getLogger();
   private final int c;
   private final int d;
   private final bgr e;
   @Nullable
   private gr f;
   private int g;
   private boolean h;
   private final Deque<gk<T>> i = Queues.newArrayDeque();
   private final List<gk<T>> j = Lists.newArrayList();

   public go(int $$0, int $$1, bgr $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.g = $$0;
   }

   private static <T extends du<T>> gq a(go<T> $$0, dp $$1) {
      return new gq(0, $$1, $$0.i::clear);
   }

   public static <T extends du<T>> void a(go<T> $$0, hd<T> $$1, T $$2, dp $$3) {
      $$0.a(new gk<>(a($$0, $$3), new gv<>($$1, $$2.p(), false).bind($$2)));
   }

   public static <T extends du<T>> void a(go<T> $$0, String $$1, ContextChain<T> $$2, T $$3, dp $$4) {
      $$0.a(new gk<>(a($$0, $$4), new gu.b<>($$1, $$2, $$3)));
   }

   private void f() {
      this.h = true;
      this.j.clear();
      this.i.clear();
   }

   public void a(gk<T> $$0) {
      if (this.j.size() + this.i.size() > 10000000) {
         this.f();
      }

      if (!this.h) {
         this.j.add($$0);
      }
   }

   public void a(int $$0) {
      while (!this.i.isEmpty() && this.i.peek().a().c() >= $$0) {
         this.i.removeFirst();
      }
   }

   public gq.a b(int $$0) {
      return () -> this.a($$0);
   }

   public void a() {
      Lists.reverse(this.j).forEach(this.i::addFirst);
      this.j.clear();

      while (!this.i.isEmpty()) {
         if (this.g == 0) {
            b.info("Command execution stopped due to limit (executed {} commands)", this.c);
            break;
         }

         gk<T> $$0 = this.i.removeFirst();
         $$0.a(this);
         if (this.h) {
            b.error("Command execution stopped due to command queue overflow (max {})", 10000000);
            break;
         }

         Lists.reverse(this.j).forEach(this.i::addFirst);
         this.j.clear();
      }
   }

   public void a(@Nullable gr $$0) {
      this.f = $$0;
   }

   @Nullable
   public gr b() {
      return this.f;
   }

   public bgr c() {
      return this.e;
   }

   public int d() {
      return this.d;
   }

   public void e() {
      this.g--;
   }

   @Override
   public void close() {
      if (this.f != null) {
         this.f.close();
      }
   }
}
