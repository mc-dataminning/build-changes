import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelOutboundHandler;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import io.netty.util.ReferenceCountUtil;

public class wz {
   public static <T extends wq> wz.b a(ws<T> $$0) {
      return a(new wo<T>($$0));
   }

   private static wz.b a(ChannelInboundHandler $$0) {
      return $$1 -> {
         $$1.pipeline().replace($$1.name(), "decoder", $$0);
         $$1.channel().config().setAutoRead(true);
      };
   }

   public static <T extends wq> wz.d b(ws<T> $$0) {
      return a(new wp<T>($$0));
   }

   private static wz.d a(ChannelOutboundHandler $$0) {
      return $$1 -> $$1.pipeline().replace($$1.name(), "encoder", $$0);
   }

   public static class a extends ChannelDuplexHandler {
      public void channelRead(ChannelHandlerContext $$0, Object $$1) {
         if (!($$1 instanceof ByteBuf) && !($$1 instanceof zr)) {
            $$0.fireChannelRead($$1);
         } else {
            ReferenceCountUtil.release($$1);
            throw new DecoderException("Pipeline has no inbound protocol configured, can't process packet " + $$1);
         }
      }

      public void write(ChannelHandlerContext $$0, Object $$1, ChannelPromise $$2) throws Exception {
         if ($$1 instanceof wz.b $$3) {
            try {
               $$3.run($$0);
            } finally {
               ReferenceCountUtil.release($$1);
            }

            $$2.setSuccess();
         } else {
            $$0.write($$1, $$2);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      void run(ChannelHandlerContext var1);

      default wz.b andThen(wz.b $$0) {
         return $$1 -> {
            this.run($$1);
            $$0.run($$1);
         };
      }
   }

   public static class c extends ChannelOutboundHandlerAdapter {
      public void write(ChannelHandlerContext $$0, Object $$1, ChannelPromise $$2) throws Exception {
         if ($$1 instanceof zr) {
            ReferenceCountUtil.release($$1);
            throw new EncoderException("Pipeline has no outbound protocol configured, can't process packet " + $$1);
         } else {
            if ($$1 instanceof wz.d $$3) {
               try {
                  $$3.run($$0);
               } finally {
                  ReferenceCountUtil.release($$1);
               }

               $$2.setSuccess();
            } else {
               $$0.write($$1, $$2);
            }
         }
      }
   }

   @FunctionalInterface
   public interface d {
      void run(ChannelHandlerContext var1);

      default wz.d andThen(wz.d $$0) {
         return $$1 -> {
            this.run($$1);
            $$0.run($$1);
         };
      }
   }
}
