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

public abstract class gly implements zn {
   private static final xa k = xa.c("disconnect.lost");
   private static final Logger l = LogUtils.getLogger();
   protected final frd a;
   protected final vt b;
   @Nullable
   protected final gmq c;
   @Nullable
   protected String d;
   protected final hqq e;
   @Nullable
   protected final gad f;
   protected boolean g;
   private final List<gly.a> m = new ArrayList<>();
   protected final Map<ali, byte[]> h;
   protected Map<String, String> i;
   protected ama j;

   protected gly(frd $$0, vt $$1, gmg $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
      this.i = $$2.j();
      this.j = $$2.k();
   }

   @Override
   public void a(zh $$0, Exception $$1) {
      l.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      zn.super.a($$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.j.a(ama.b.a).map(ama.a::c);
      this.b.a(new vv(xa.c("disconnect.packetError"), $$2, $$3));
   }

   @Override
   public vv a(xa $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.j.a(ama.b.a).map(ama.a::c);
      return new vv($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zh $$0, Throwable $$1) {
      p $$2 = p.a($$1, "Packet handling error");
      zk.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ag.f() + "-client.txt");
      Optional<ama.a> $$5 = this.j.a(ama.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, z.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zh<?> $$0) {
      return zn.super.a($$0) ? true : this.g && ($$0 instanceof zw || $$0 instanceof zx);
   }

   @Override
   public void a(zr $$0) {
      this.a(new aad($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(zs $$0) {
      zk.a($$0, this, this.a);
      this.b(new aae($$0.b()));
   }

   @Override
   public void a(zo $$0) {
      aak $$1 = $$0.b();
      if (!($$1 instanceof aal)) {
         zk.a($$0, this, this.a);
         if ($$1 instanceof aai $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(aak var1);

   @Override
   public void a(zu $$0) {
      zk.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aaf($$1, aaf.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         gmq.a $$5 = this.c != null ? this.c.b() : gmq.a.c;
         if ($$5 != gmq.a.c && (!$$4 || $$5 != gmq.a.b)) {
            this.a.af().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(zt $$0) {
      zk.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.af().a($$0x), () -> this.a.af().e());
   }

   static xa a(xa $$0, @Nullable xa $$1) {
      return (xa)($$1 == null ? $$0 : xa.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
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
   public void a(abr $$0) {
      zk.a($$0, this, this.a);
      this.b.a(new abu($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(zw $$0) {
      zk.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(zp $$0) {
      zk.a($$0, this, this.a);
      this.i = $$0.b();
   }

   @Override
   public void a(zv $$0) {
      zk.a($$0, this, this.a);
      List<ama.c> $$1 = $$0.b();
      Builder<ama.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (ama.c $$3 : $$1) {
         try {
            URI $$4 = ag.a($$3.b());
            $$2.add(new ama.a($$3.a(), $$4));
         } catch (Exception var7) {
            l.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.j = new ama($$2.build());
   }

   @Override
   public void a(zx $$0) {
      this.g = true;
      zk.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(xa.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gnt $$1 = new gnt($$0.b(), $$0.e());
         fzc.a(Objects.requireNonNullElseGet(this.f, gaf::new), this.a, $$1, this.c, false, new gmu(this.h));
      }
   }

   @Override
   public void a(zq $$0) {
      this.b.a($$0.b());
   }

   protected void e() {
      Iterator<gly.a> $$0 = this.m.iterator();

      while ($$0.hasNext()) {
         gly.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ag.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zh<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(vv $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      l.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(p $$0, q $$1) {
      $$1.a("Is Local", () -> String.valueOf(this.b.e()));
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.i.isEmpty()) {
         q $$2 = $$0.a("Custom Server Details");
         this.i.forEach($$2::a);
      }
   }

   protected gad b(vv $$0) {
      gad $$1 = Objects.requireNonNullElseGet(this.f, () -> new gcv(new gaf()));
      return (gad)(this.c != null && this.c.e() ? new hrj($$1, k, $$0.a()) : new fzk($$1, k, $$0));
   }

   @Nullable
   public String f() {
      return this.d;
   }

   private void a(zh<? extends wm> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.m.add(new gly.a($$0, $$1, ag.c() + $$2.toMillis()));
      }
   }

   private gad a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xa $$4) {
      gad $$5 = this.a.z;
      return $$5 instanceof gly.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new gly.b(this.a, $$5, List.of(new gly.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   static record a(zh<? extends wm> a, BooleanSupplier b, long c) {
   }

   class b extends fzb {
      private final List<gly.b.a> s;
      @Nullable
      private final gad u;

      b(final frd $$0, @Nullable final gad $$1, final List<gly.b.a> $$2, final boolean $$3, @Nullable final xa $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hnz $$6 = $$0.af();
               if ($$5) {
                  if (gly.this.c != null) {
                     gly.this.c.a(gmq.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     gly.this.b.a(xa.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (gly.this.c != null) {
                     gly.this.c.a(gmq.a.b);
                  }
               }

               for (gly.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (gly.this.c != null) {
                  gmr.b(gly.this.c);
               }
            },
            $$3 ? xa.c("multiplayer.requiredTexturePrompt.line1") : xa.c("multiplayer.texturePrompt.line1"),
            gly.a($$3 ? xa.c("multiplayer.requiredTexturePrompt.line2").a(o.o, o.r) : xa.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? wz.i : wz.f,
            $$3 ? wz.p : wz.g
         );
         this.s = $$2;
         this.u = $$1;
      }

      public gly.b a(frd $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xa $$5) {
         List<gly.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.s.size() + 1).addAll(this.s).add(new gly.b.a($$1, $$2, $$3)).build();
         return gly.this.new b($$0, this.u, $$6, $$4, $$5);
      }

      static record a(UUID a, URL b, String c) {
      }
   }
}
