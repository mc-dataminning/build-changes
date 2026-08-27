import com.google.common.primitives.Ints;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.SignatureException;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record vv(wa d, @Nullable vr e, vy f, @Nullable vf g, vj h) {
   public static final MapCodec<vv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               wa.a.fieldOf("link").forGetter(vv::k),
               vr.a.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               vy.a.forGetter(vv::m),
               vh.a.optionalFieldOf("unsigned_content").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               vj.a.optionalFieldOf("filter_mask", vj.c).forGetter(vv::o)
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new vv($$0x, (vr)$$1.orElse(null), $$2, (vf)$$3.orElse(null), $$4))
   );
   private static final UUID i = ac.d;
   public static final Duration b = Duration.ofMinutes(5L);
   public static final Duration c = b.plus(Duration.ofMinutes(2L));

   public static vv a(String $$0) {
      return a(i, $$0);
   }

   public static vv a(UUID $$0, String $$1) {
      vy $$2 = vy.a($$1);
      wa $$3 = wa.a($$0);
      return new vv($$3, null, $$2, null, vj.c);
   }

   public vv a(vf $$0) {
      vf $$1 = !$$0.equals(vf.b(this.c())) ? $$0 : null;
      return new vv(this.d, this.e, this.f, $$1, this.h);
   }

   public vv a() {
      return this.g != null ? new vv(this.d, this.e, this.f, null, this.h) : this;
   }

   public vv a(vj $$0) {
      return this.h.equals($$0) ? this : new vv(this.d, this.e, this.f, this.g, $$0);
   }

   public vv a(boolean $$0) {
      return this.a($$0 ? this.h : vj.c);
   }

   public vv b() {
      vy $$0 = vy.a(this.c());
      wa $$1 = wa.a(this.g());
      return new vv($$1, null, $$0, this.g, this.h);
   }

   public static void a(avb.a $$0, wa $$1, vy $$2) throws SignatureException {
      $$0.update(Ints.toByteArray(1));
      $$1.a($$0);
      $$2.a($$0);
   }

   public boolean a(avc $$0) {
      return this.e != null && this.e.a($$0, $$0x -> a($$0x, this.d, this.f));
   }

   public String c() {
      return this.f.a();
   }

   public vf d() {
      return Objects.requireNonNullElseGet(this.g, () -> vf.b(this.c()));
   }

   public Instant e() {
      return this.f.b();
   }

   public long f() {
      return this.f.c();
   }

   public boolean a(Instant $$0) {
      return $$0.isAfter(this.e().plus(b));
   }

   public boolean b(Instant $$0) {
      return $$0.isAfter(this.e().plus(c));
   }

   public UUID g() {
      return this.d.c();
   }

   public boolean h() {
      return this.g().equals(i);
   }

   public boolean i() {
      return this.e != null;
   }

   public boolean a(UUID $$0) {
      return this.i() && this.d.c().equals($$0);
   }

   public boolean j() {
      return this.h.b();
   }

   public wa k() {
      return this.d;
   }

   @Nullable
   public vr l() {
      return this.e;
   }

   public vy m() {
      return this.f;
   }

   @Nullable
   public vf n() {
      return this.g;
   }

   public vj o() {
      return this.h;
   }
}
