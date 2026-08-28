import com.google.common.hash.HashCode;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;

public class gtg {
   private final gtd a;
   final gte b;
   private final gtf c;
   private final Runnable d;
   private gtg.c e;
   final List<gtg.e> f = new ArrayList<>();

   public gtg(gtd $$0, gte $$1, gtf $$2, Runnable $$3, gtg.c $$4) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
   }

   void f() {
      this.d.run();
   }

   private void b(UUID $$0) {
      for (gtg.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(gtg.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == gtg.c.c) {
         this.b.a($$0, gte.a.a);
      } else {
         this.a($$0, new gtg.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == gtg.c.c) {
         this.b.a($$0, gte.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         gtg.e $$5 = new gtg.e($$0, $$2, null);
         $$5.f = gtg.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, gtg.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == gtg.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(gtg.e $$0) {
      this.b.a($$0.a, gte.b.a);
      $$0.h = true;
   }

   @Nullable
   private gtg.e c(UUID $$0) {
      for (gtg.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      gtg.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(gtg.d.e);
         this.f();
      }
   }

   public void a() {
      for (gtg.e $$0 : this.f) {
         $$0.a(gtg.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = gtg.c.b;

      for (gtg.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = gtg.c.c;

      for (gtg.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(gtg.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = gtg.c.a;
   }

   public void e() {
      boolean $$0 = this.h();
      if (!$$0) {
         this.i();
      }

      this.g();
   }

   private void g() {
      this.f.removeIf($$0 -> {
         if ($$0.g != gtg.a.a) {
            return false;
         } else if ($$0.e != null) {
            gte.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<gtg.e> $$0, asl.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (gtg.e $$2 : this.f) {
            if ($$2.g != gtg.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(gtg.d.a);
               } else {
                  $$2.a(gtg.d.d);
               }
            }
         }
      }

      for (gtg.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = gtg.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, gte.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<gtg.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (gtg.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != gtg.b.c) {
               $$1 = true;
            }

            if ($$2.f == gtg.b.a) {
               $$2.f = gtg.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, asl.c> $$3 = new HashMap<>();

         for (gtg.e $$4 : $$0) {
            $$3.put($$4.a, new asl.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<gtg.e> $$1 = new ArrayList<>();
      final List<gtg.e> $$2 = new ArrayList<>();

      for (gtg.e $$3 : this.f) {
         if ($$3.g == gtg.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == gtg.b.c && !$$3.a();
         if ($$4 && $$3.g == gtg.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == gtg.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (gtg.e $$5 : $$1) {
            if ($$5.g != gtg.a.c) {
               $$5.g = gtg.a.b;
            }
         }

         for (gtg.e $$6 : $$2) {
            $$6.g = gtg.a.b;
         }

         this.c.scheduleReload(new gtf.a() {
            @Override
            public void a() {
               for (gtg.e $$0 : $$1) {
                  $$0.g = gtg.a.c;
                  if ($$0.e == null) {
                     gtg.this.b.a($$0.a, gte.a.b);
                  }
               }

               for (gtg.e $$1 : $$2) {
                  $$1.g = gtg.a.a;
               }

               gtg.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (gtg.e $$1 : gtg.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(gtg.d.d);
                           break;
                        case b:
                           $$1.g = gtg.a.a;
                           $$1.a(gtg.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  gtg.this.f();
               } else {
                  for (gtg.e $$2 : gtg.this.f) {
                     if ($$2.g == gtg.a.b) {
                        $$2.g = gtg.a.a;
                     }
                  }
               }
            }

            @Override
            public List<gtf.b> b() {
               return $$1.stream().map($$0 -> new gtf.b($$0.a, $$0.d)).toList();
            }
         });
      }
   }

   static enum a {
      a,
      b,
      c;
   }

   static enum b {
      a,
      b,
      c;
   }

   public static enum c {
      a,
      b,
      c;
   }

   static enum d {
      a(gte.a.d),
      b(gte.a.e),
      c(gte.a.a),
      d(gte.a.c),
      e(null),
      f(null);

      @Nullable
      final gte.a g;

      private d(@Nullable final gte.a $$0) {
         this.g = $$0;
      }
   }

   static class e {
      final UUID a;
      final URL b;
      @Nullable
      final HashCode c;
      @Nullable
      Path d;
      @Nullable
      gtg.d e;
      gtg.b f = gtg.b.a;
      gtg.a g = gtg.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(gtg.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
