import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class gcf implements zv {
   private static final xi l = xi.c("disconnect.lost");
   private static final Logger m = LogUtils.getLogger();
   protected final fji a;
   protected final wc b;
   @Nullable
   protected final gcw c;
   @Nullable
   protected String d;
   protected final hds e;
   @Nullable
   protected final fra f;
   protected boolean g;
   @Deprecated(
      forRemoval = true
   )
   protected final boolean h;
   private final List<gcf.a> n = new ArrayList<>();
   protected final Map<ali, byte[]> i;
   protected Map<String, String> j;
   protected ama k;

   protected gcf(fji $$0, wc $$1, gcm $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.i = $$2.h();
      this.h = $$2.j();
      this.j = $$2.k();
      this.k = $$2.l();
   }

   @Override
   public void a(zp $$0, Exception $$1) {
      m.error("Failed to handle packet {}", $$0, $$1);
      zv.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.k.a(ama.b.a).map(ama.a::c);
      if (this.h) {
         this.b.a(new we(xi.c("disconnect.packetError"), $$2, $$3));
      }
   }

   @Override
   public we a(xi $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.k.a(ama.b.a).map(ama.a::c);
      return new we($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zp $$0, Throwable $$1) {
      o $$2 = o.a($$1, "Packet handling error");
      zs.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ae.f() + "-client.txt");
      Optional<ama.a> $$5 = this.k.a(ama.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, y.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zp<?> $$0) {
      return zv.super.a($$0) ? true : this.g && ($$0 instanceof aae || $$0 instanceof aaf);
   }

   @Override
   public void a(zz $$0) {
      this.a(new aal($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(aaa $$0) {
      zs.a($$0, this, this.a);
      this.b(new aam($$0.b()));
   }

   @Override
   public void a(zw $$0) {
      aas $$1 = $$0.b();
      if (!($$1 instanceof aat)) {
         zs.a($$0, this, this.a);
         if ($$1 instanceof aaq $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aas var1);

   @Override
   public void a(aac $$0) {
      zs.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aan($$1, aan.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gcw.a $$5 = this.c != null ? this.c.b() : gcw.a.c;
         if ($$5 != gcw.a.c && (!$$4 || $$5 != gcw.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(aab $$0) {
      zs.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static xi a(xi $$0, @Nullable xi $$1) {
      return (xi)($$1 == null ? $$0 : xi.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
   }

   @Nullable
   private static URL a(String $$0) {
      try {
         URL $$1 = new URL($$0);
         String $$2 = $$1.getProtocol();
         return !"http".equals($$2) && !"https".equals($$2) ? null : $$1;
      } catch (MalformedURLException var3) {
         return null;
      }
   }

   @Override
   public void a(abz $$0) {
      zs.a($$0, this, this.a);
      this.b.a(new acc($$0.b(), this.i.get($$0.b())));
   }

   @Override
   public void a(aae $$0) {
      zs.a($$0, this, this.a);
      this.i.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zx $$0) {
      zs.a($$0, this, this.a);
      this.j = $$0.b();
   }

   @Override
   public void a(aad $$0) {
      zs.a($$0, this, this.a);
      List<ama.c> $$1 = $$0.b();
      Builder<ama.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (ama.c $$3 : $$1) {
         try {
            URI $$4 = ae.a($$3.b());
            $$2.add(new ama.a($$3.a(), $$4));
         } catch (Exception var7) {
            m.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.k = new ama($$2.build());
   }

   @Override
   public void a(aaf $$0) {
      this.g = true;
      zs.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(xi.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gdz $$1 = new gdz($$0.b(), $$0.e());
         fpz.a(Objects.requireNonNullElseGet(this.f, frc::new), this.a, $$1, this.c, false, new gda(this.i));
      }
   }

   @Override
   public void a(zy $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<gcf.a> $$0 = this.n.iterator();

      while ($$0.hasNext()) {
         gcf.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ae.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zp<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(we $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      m.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(o $$0, p $$1) {
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.j.isEmpty()) {
         p $$2 = $$0.a("Custom Server Details");
         this.j.forEach($$2::a);
      }
   }

   protected fra b(we $$0) {
      fra $$1 = Objects.requireNonNullElseGet(this.f, () -> new ftp(new frc()));
      return (fra)(this.c != null && this.c.e() ? new hel($$1, l, $$0.a()) : new fqh($$1, l, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zp<? extends wu> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.n.add(new gcf.a($$0, $$1, ae.c() + $$2.toMillis()));
      }
   }

   private fra a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xi $$4) {
      fra $$5 = this.a.z;
      return $$5 instanceof gcf.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gcf.b(this.a, $$5, List.of(new gcf.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zp<? extends wu> a, BooleanSupplier b, long c) {
   }

   class b extends fpy {
      private final List<gcf.b.a> s;
      @Nullable
      private final fra u;

      b(final fji $$0, @Nullable final fra $$1, final List<gcf.b.a> $$2, final boolean $$3, @Nullable final xi $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hbc $$6 = $$0.af();
               if ($$5) {
                  if (gcf.this.c != null) {
                     gcf.this.c.a(gcw.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gcf.this.b.a(xi.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gcf.this.c != null) {
                     gcf.this.c.a(gcw.a.b);
                  }
               }

               for (gcf.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gcf.this.c != null) {
                  gcx.b(gcf.this.c);
               }
            },
            $$3 ? xi.c("multiplayer.requiredTexturePrompt.line1") : xi.c("multiplayer.texturePrompt.line1"),
            gcf.a($$3 ? xi.c("multiplayer.requiredTexturePrompt.line2").a(n.o, n.r) : xi.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xh.i : xh.f,
            $$3 ? xh.p : xh.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gcf.b a(fji $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xi $$5) {
         List<gcf.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gcf.b.a($$1, $$2, $$3)).build();
         return gcf.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
