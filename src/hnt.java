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

public class hnt {
   private final hnq a;
   final hnr b;
   private final hns c;
   private final Runnable d;
   private hnt.c e;
   final List<hnt.e> f = new ArrayList<>();

   public hnt(hnq $$0, hnr $$1, hns $$2, Runnable $$3, hnt.c $$4) {
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
      for (hnt.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hnt.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hnt.c.c) {
         this.b.a($$0, hnr.a.a);
      } else {
         this.a($$0, new hnt.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hnt.c.c) {
         this.b.a($$0, hnr.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hnt.e $$5 = new hnt.e($$0, $$2, null);
         $$5.f = hnt.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hnt.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hnt.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hnt.e $$0) {
      this.b.a($$0.a, hnr.b.a);
      $$0.h = true;
   }

   @Nullable
   private hnt.e c(UUID $$0) {
      for (hnt.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hnt.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hnt.d.e);
         this.f();
      }
   }

   public void a() {
      for (hnt.e $$0 : this.f) {
         $$0.a(hnt.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hnt.c.b;

      for (hnt.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hnt.c.c;

      for (hnt.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hnt.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hnt.c.a;
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
         if ($$0.g != hnt.a.a) {
            return false;
         } else if ($$0.e != null) {
            hnr.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hnt.e> $$0, atv.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hnt.e $$2 : this.f) {
            if ($$2.g != hnt.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hnt.d.a);
               } else {
                  $$2.a(hnt.d.d);
               }
            }
         }
      }

      for (hnt.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hnt.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hnr.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hnt.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hnt.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hnt.b.c) {
               $$1 = true;
            }

            if ($$2.f == hnt.b.a) {
               $$2.f = hnt.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, atv.c> $$3 = new HashMap<>();

         for (hnt.e $$4 : $$0) {
            $$3.put($$4.a, new atv.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hnt.e> $$1 = new ArrayList<>();
      final List<hnt.e> $$2 = new ArrayList<>();

      for (hnt.e $$3 : this.f) {
         if ($$3.g == hnt.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hnt.b.c && !$$3.a();
         if ($$4 && $$3.g == hnt.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hnt.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hnt.e $$5 : $$1) {
            if ($$5.g != hnt.a.c) {
               $$5.g = hnt.a.b;
            }
         }

         for (hnt.e $$6 : $$2) {
            $$6.g = hnt.a.b;
         }

         this.c.scheduleReload(new hns.a() {
            @Override
            public void a() {
               for (hnt.e $$0 : $$1) {
                  $$0.g = hnt.a.c;
                  if ($$0.e == null) {
                     hnt.this.b.a($$0.a, hnr.a.b);
                  }
               }

               for (hnt.e $$1 : $$2) {
                  $$1.g = hnt.a.a;
               }

               hnt.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hnt.e $$1 : hnt.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hnt.d.d);
                           break;
                        case b:
                           $$1.g = hnt.a.a;
                           $$1.a(hnt.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hnt.this.f();
               } else {
                  for (hnt.e $$2 : hnt.this.f) {
                     if ($$2.g == hnt.a.b) {
                        $$2.g = hnt.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hns.b> b() {
               return $$1.stream().map($$0 -> new hns.b($$0.a, $$0.d)).toList();
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
      a(hnr.a.d),
      b(hnr.a.e),
      c(hnr.a.a),
      d(hnr.a.c),
      e(null),
      f(null);

      @Nullable
      final hnr.a g;

      private d(@Nullable final hnr.a $$0) {
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
      hnt.d e;
      hnt.b f = hnt.b.a;
      hnt.a g = hnt.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hnt.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
