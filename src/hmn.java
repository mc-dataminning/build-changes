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

public class hmn {
   private final hmk a;
   final hml b;
   private final hmm c;
   private final Runnable d;
   private hmn.c e;
   final List<hmn.e> f = new ArrayList<>();

   public hmn(hmk $$0, hml $$1, hmm $$2, Runnable $$3, hmn.c $$4) {
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
      for (hmn.e $$1 : this.f) {
         if ($$1.a.equals($$0)) {
            $$1.a(hmn.d.f);
         }
      }
   }

   public void a(UUID $$0, URL $$1, @Nullable HashCode $$2) {
      if (this.e == hmn.c.c) {
         this.b.a($$0, hml.a.a);
      } else {
         this.a($$0, new hmn.e($$0, $$1, $$2));
      }
   }

   public void a(UUID $$0, Path $$1) {
      if (this.e == hmn.c.c) {
         this.b.a($$0, hml.a.a);
      } else {
         URL $$2;
         try {
            $$2 = $$1.toUri().toURL();
         } catch (MalformedURLException var5) {
            throw new IllegalStateException("Can't convert path to URL " + $$1, var5);
         }

         hmn.e $$5 = new hmn.e($$0, $$2, null);
         $$5.f = hmn.b.c;
         $$5.d = $$1;
         this.a($$0, $$5);
      }
   }

   private void a(UUID $$0, hmn.e $$1) {
      this.b($$0);
      this.f.add($$1);
      if (this.e == hmn.c.b) {
         this.a($$1);
      }

      this.f();
   }

   private void a(hmn.e $$0) {
      this.b.a($$0.a, hml.b.a);
      $$0.h = true;
   }

   @Nullable
   private hmn.e c(UUID $$0) {
      for (hmn.e $$1 : this.f) {
         if (!$$1.a() && $$1.a.equals($$0)) {
            return $$1;
         }
      }

      return null;
   }

   public void a(UUID $$0) {
      hmn.e $$1 = this.c($$0);
      if ($$1 != null) {
         $$1.a(hmn.d.e);
         this.f();
      }
   }

   public void a() {
      for (hmn.e $$0 : this.f) {
         $$0.a(hmn.d.e);
      }

      this.f();
   }

   public void b() {
      this.e = hmn.c.b;

      for (hmn.e $$0 : this.f) {
         if (!$$0.h && !$$0.a()) {
            this.a($$0);
         }
      }

      this.f();
   }

   public void c() {
      this.e = hmn.c.c;

      for (hmn.e $$0 : this.f) {
         if (!$$0.h) {
            $$0.a(hmn.d.c);
         }
      }

      this.f();
   }

   public void d() {
      this.e = hmn.c.a;
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
         if ($$0.g != hmn.a.a) {
            return false;
         } else if ($$0.e != null) {
            hml.a $$1 = $$0.e.g;
            if ($$1 != null) {
               this.b.a($$0.a, $$1);
            }

            return true;
         } else {
            return false;
         }
      });
   }

   private void a(Collection<hmn.e> $$0, atk.b $$1) {
      if (!$$1.b().isEmpty()) {
         for (hmn.e $$2 : this.f) {
            if ($$2.g != hmn.a.c) {
               if ($$1.b().contains($$2.a)) {
                  $$2.a(hmn.d.a);
               } else {
                  $$2.a(hmn.d.d);
               }
            }
         }
      }

      for (hmn.e $$3 : $$0) {
         Path $$4 = $$1.a().get($$3.a);
         if ($$4 != null) {
            $$3.f = hmn.b.c;
            $$3.d = $$4;
            if (!$$3.a()) {
               this.b.a($$3.a, hml.b.b);
            }
         }
      }

      this.f();
   }

   private boolean h() {
      List<hmn.e> $$0 = new ArrayList<>();
      boolean $$1 = false;

      for (hmn.e $$2 : this.f) {
         if (!$$2.a() && $$2.h) {
            if ($$2.f != hmn.b.c) {
               $$1 = true;
            }

            if ($$2.f == hmn.b.a) {
               $$2.f = hmn.b.b;
               $$0.add($$2);
            }
         }
      }

      if (!$$0.isEmpty()) {
         Map<UUID, atk.c> $$3 = new HashMap<>();

         for (hmn.e $$4 : $$0) {
            $$3.put($$4.a, new atk.c($$4.b, $$4.c));
         }

         this.a.a($$3, $$1x -> this.a($$0, $$1x));
      }

      return $$1;
   }

   private void i() {
      boolean $$0 = false;
      final List<hmn.e> $$1 = new ArrayList<>();
      final List<hmn.e> $$2 = new ArrayList<>();

      for (hmn.e $$3 : this.f) {
         if ($$3.g == hmn.a.b) {
            return;
         }

         boolean $$4 = $$3.h && $$3.f == hmn.b.c && !$$3.a();
         if ($$4 && $$3.g == hmn.a.a) {
            $$1.add($$3);
            $$0 = true;
         }

         if ($$3.g == hmn.a.c) {
            if (!$$4) {
               $$0 = true;
               $$2.add($$3);
            } else {
               $$1.add($$3);
            }
         }
      }

      if ($$0) {
         for (hmn.e $$5 : $$1) {
            if ($$5.g != hmn.a.c) {
               $$5.g = hmn.a.b;
            }
         }

         for (hmn.e $$6 : $$2) {
            $$6.g = hmn.a.b;
         }

         this.c.scheduleReload(new hmm.a() {
            @Override
            public void a() {
               for (hmn.e $$0 : $$1) {
                  $$0.g = hmn.a.c;
                  if ($$0.e == null) {
                     hmn.this.b.a($$0.a, hml.a.b);
                  }
               }

               for (hmn.e $$1 : $$2) {
                  $$1.g = hmn.a.a;
               }

               hmn.this.f();
            }

            @Override
            public void a(boolean $$0) {
               if (!$$0) {
                  $$1.clear();

                  for (hmn.e $$1 : hmn.this.f) {
                     switch ($$1.g) {
                        case a:
                           $$1.a(hmn.d.d);
                           break;
                        case b:
                           $$1.g = hmn.a.a;
                           $$1.a(hmn.d.b);
                           break;
                        case c:
                           $$1.add($$1);
                     }
                  }

                  hmn.this.f();
               } else {
                  for (hmn.e $$2 : hmn.this.f) {
                     if ($$2.g == hmn.a.b) {
                        $$2.g = hmn.a.a;
                     }
                  }
               }
            }

            @Override
            public List<hmm.b> b() {
               return $$1.stream().map($$0 -> new hmm.b($$0.a, $$0.d)).toList();
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
      a(hml.a.d),
      b(hml.a.e),
      c(hml.a.a),
      d(hml.a.c),
      e(null),
      f(null);

      @Nullable
      final hml.a g;

      private d(@Nullable final hml.a $$0) {
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
      hmn.d e;
      hmn.b f = hmn.b.a;
      hmn.a g = hmn.a.a;
      boolean h;

      e(UUID $$0, URL $$1, @Nullable HashCode $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      public void a(hmn.d $$0) {
         if (this.e == null) {
            this.e = $$0;
         }
      }

      public boolean a() {
         return this.e != null;
      }
   }
}
