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

public class hch {
   private final hce a;
   final hcf b;
   private final hcg c;
   private final Runnable d;
   private hch.c e;
   final List<hch.e> f = new ArrayList<>();

   public hch(hce $$0, hcf $$1, hcg $$2, Runnable $$3, hch.c $$4) {
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
      for (hch.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hch.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hch.c.c) {
         this.b.a($$0, hcf.a.a);
      } else {
         this.a($$0, new hch.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hch.c.c) {
         this.b.a($$0, hcf.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hch.e $$5 = new hch.e($$0, $$2, null);
         $$5.f = hch.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hch.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hch.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hch.e $$0) {
      this.b.a($$0.a, hcf.b.a);
      $$0.h = true;
   }

   @Nullable
   private hch.e c(UUID $$0) {
      for (hch.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hch.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hch.d.e);
         this.f();
      }
   }

   public void a() {
      for (hch.e $$0 : this.f) {
         $$0.a(hch.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hch.c.b;

      for (hch.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hch.c.c;

      for (hch.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hch.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hch.c.a;
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
         if ($$0.g != hch.a.a) {
            return false;
         } else if ($$0.e != null) {
            hcf.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hch.e> $$0, atj.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hch.e $$2 : this.f) {
            if ($$2.g != hch.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hch.d.a);
               } else {
                  $$2.a(hch.d.d);
               }
            }
         }
      }

      for (hch.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hch.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hcf.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hch.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hch.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hch.b.c) {
               $$1 = true;
            }

            if ($$2.f == hch.b.a) {
               $$2.f = hch.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, atj.c> $$3 = new HashMap<>();

         for (hch.e $$4 : $$0) {
            $$3.put($$4.a, new atj.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hch.e> $$1 = new ArrayList<>();
      final List<hch.e> $$2 = new ArrayList<>();

      for (hch.e $$3 : this.f) {
         if ($$3.g == hch.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hch.b.c && !$$3.a();
         if ($$4 && $$3.g == hch.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hch.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hch.e $$5 : $$1) {
            if ($$5.g != hch.a.c) {
               $$5.g = hch.a.b;
            }
         }

         for (hch.e $$6 : $$2) {
            $$6.g = hch.a.b;
         }

         this.c.scheduleReload(new hcg.a() {
            @Override
            public void a() {
               for (hch.e $$0 : $$1) {
                  $$0.g = hch.a.c;
                  if ($$0.e == null) {
                     hch.this.b.a($$0.a, hcf.a.b);
                  }
               }

               for (hch.e $$1 : $$2) {
                  $$1.g = hch.a.a;
               }

               hch.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hch.e $$1 : hch.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hch.d.d);
                           break;
                        case b:
                           $$1.g = hch.a.a;
                           $$1.a(hch.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hch.this.f();
               } else {
                  for (hch.e $$2 : hch.this.f) {
                     if ($$2.g == hch.a.b) {
                        $$2.g = hch.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hcg.b> b() {
               return $$1.stream().map($$0 -> new hcg.b($$0.a, $$0.d)).toList();
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
      a(hcf.a.d),
      b(hcf.a.e),
      c(hcf.a.a),
      d(hcf.a.c),
      e(null),
      f(null);

      @Nullable
      final hcf.a g;

      private d(@Nullable final hcf.a $$0) {
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
      hch.d e;
      hch.b f = hch.b.a;
      hch.a g = hch.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hch.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
