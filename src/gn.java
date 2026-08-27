import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.logging.LogUtils;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gn<T> implements AutoCloseable {
   private static final int a = 10000000;
   private static final Logger b = LogUtils.getLogger();
   private final int c;
   private final int d;
   private final bes e;
   @Nullable
   private gp f;
   private int g;
   private boolean h;
   private final Deque<gj<T>> i = Queues.newArrayDeque();
   private final List<gj<T>> j = Lists.newArrayList();

   public gn(int $$0, int $$1, bes $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.g = $$0;
   }

   public void a(gz<T> $$0, T $$1) {
      this.a(new gj<>(0, new gt<>($$0).bind($$1)));
   }

   public static <T extends dw<T>> void a(gn<T> $$0, String $$1, ContextChain<T> $$2, T $$3) {
      $$0.a(new gj<>(0, new gs.b<>($$1, $$2, $$3)));
   }

   private void f() {
      this.h = true;
      this.j.clear();
      this.i.clear();
   }

   public void a(gj<T> $$0) {
      if (this.j.size() + this.i.size() > 10000000) {
         this.f();
      }

      if (!this.h) {
         this.j.add($$0);
      }
   }

   public void a(int $$0) {
      while (!this.i.isEmpty() && this.i.peek().a() >= $$0) {
         this.i.removeFirst();
      }
   }

   public void a() {
      Lists.reverse(this.j).forEach(this.i::addFirst);
      this.j.clear();

      while (!this.i.isEmpty()) {
         if (this.g == 0) {
            b.info("Command execution stopped due to limit (executed {} commands)", this.c);
            break;
         }

         gj<T> $$0 = this.i.removeFirst();
         $$0.a(this);
         if (this.h) {
            b.error("Command execution stopped due to command queue overflow (max {})", 10000000);
            break;
         }

         Lists.reverse(this.j).forEach(this.i::addFirst);
         this.j.clear();
      }
   }

   public void a(@Nullable gp $$0) {
      this.f = $$0;
   }

   @Nullable
   public gp b() {
      return this.f;
   }

   public bes c() {
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
